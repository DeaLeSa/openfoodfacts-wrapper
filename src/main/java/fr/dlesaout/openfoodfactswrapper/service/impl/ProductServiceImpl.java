package fr.dlesaout.openfoodfactswrapper.service.impl;

import fr.dlesaout.openfoodfactswrapper.model.*;
import fr.dlesaout.openfoodfactswrapper.model.resource.ProductResponseResource;
import fr.dlesaout.openfoodfactswrapper.service.ProductService;
import fr.dlesaout.openfoodfactswrapper.util.ApiUrls;
import fr.dlesaout.openfoodfactswrapper.util.Attributes;
import fr.dlesaout.openfoodfactswrapper.util.HttpHeadersUtil;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    private final ModelMapper modelMapper;

    private final RestTemplate restTemplate;

    public ProductServiceImpl(ModelMapper modelMapper, RestTemplate restTemplate) {
        this.modelMapper = modelMapper;
        this.restTemplate = restTemplate;
    }

    @Override
    public ProductResponse fetchProductByCode(String code, List<String> fields) {
        HttpHeaders headers = HttpHeadersUtil.createHttpHeaders();
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        StringBuilder urlBuilder = new StringBuilder(String.format(ApiUrls.PRODUCT_BY_CODE.url, code));
        if (fields != null && !fields.isEmpty()) {
            appendQueryParam(urlBuilder, "fields", fields);
        }
        ProductResponseResource response = restTemplate.exchange(urlBuilder.toString(), HttpMethod.GET, requestEntity, ProductResponseResource.class).getBody();
        return modelMapper.map(response, ProductResponse.class);
    }

    @Override
    public ProductList fetchProducts(String nutriscore, String category, String brand, List<String> fields, Integer page) {
        HttpHeaders headers = HttpHeadersUtil.createHttpHeaders();
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        String url = buildUrlForSearch(nutriscore, category, brand, fields, page);

        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<>() {
                }
        );

        return processResponse(responseEntity, fields);
    }

    private String buildUrlForSearch(String nutriscore, String category, String brand, List<String> fields, Integer page) {
        StringBuilder urlBuilder = new StringBuilder(ApiUrls.BASE_SEARCH.url);
        appendQueryParam(urlBuilder, Attributes.NUTRITION_GRADES_TAGS.getAttribute(), nutriscore);
        appendQueryParam(urlBuilder, Attributes.CATEGORIES_TAGS.getAttribute(), category);
        appendQueryParam(urlBuilder, Attributes.BRANDS_TAGS.getAttribute(), brand);
        appendQueryParam(urlBuilder, Attributes.FIELDS.getAttribute(), fields);
        urlBuilder.append(Attributes.PAGE.getAttribute()).append("=").append(page != null ? page : 1).append("&json=true");

        return urlBuilder.toString();
    }

    private void appendQueryParam(StringBuilder urlBuilder, String param, String value) {
        if (value != null) {
            urlBuilder.append(param).append("=").append(value).append("&");
        }
    }

    private void appendQueryParam(StringBuilder urlBuilder, String param, List<String> values) {
        if (values != null && !values.isEmpty()) {
            String value = String.join(",", values);
            urlBuilder.append(param).append("=").append(value).append("&");
        }
    }

    private ProductList processResponse(ResponseEntity<Map<String, Object>> responseEntity, List<String> fields) {
        List<ProductResponse> productList = new ArrayList<>();
        Map<String, Object> body = responseEntity.getBody();

        if (body != null && !body.isEmpty()) {
            Object productListObj = body.get(Attributes.PRODUCTS.getAttribute());
            if (productListObj instanceof List) {
                @SuppressWarnings("unchecked")
                List<Map<String, Object>> tempList = (List<Map<String, Object>>) productListObj;
                List<ProductResponse> collectedResponses = tempList.parallelStream()
                        .filter(productMap -> productMap.containsKey("code"))
                        .map(productMap -> fetchProductByCode((String) productMap.get("code"), fields))
                        .toList();
                productList.addAll(collectedResponses);
            }
        }

        ProductList response = new ProductList();
        response.setPaginationInfo(handlePaginationInfo(body));
        response.setProducts(productList);

        return response;
    }

    private PaginationInfo handlePaginationInfo(Map<String, Object> body) {
        int numberOfProducts = 0;
        int pageNumber = 0;
        int numberOfItemsInSelectedPage = 0;
        int numberMaxOfItemsPerPage = 0;

        if (body != null && !body.isEmpty()) {
            numberOfProducts = Integer.parseInt(body.get(Attributes.COUNT.getAttribute()).toString());
            pageNumber = Integer.parseInt(body.get(Attributes.PAGE.getAttribute()).toString());
            numberOfItemsInSelectedPage = Integer.parseInt(body.get(Attributes.PAGE_COUNT.getAttribute()).toString());
            numberMaxOfItemsPerPage = Integer.parseInt(body.get(Attributes.PAGE_SIZE.getAttribute()).toString());
        }

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCount(numberOfProducts);
        paginationInfo.setPage(pageNumber);
        paginationInfo.setPageCount(numberOfItemsInSelectedPage);
        paginationInfo.setPageSize(numberMaxOfItemsPerPage);

        return paginationInfo;
    }

}