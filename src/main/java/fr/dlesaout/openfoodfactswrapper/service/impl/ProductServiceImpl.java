package fr.dlesaout.openfoodfactswrapper.service.impl;

import fr.dlesaout.openfoodfactswrapper.model.*;
import fr.dlesaout.openfoodfactswrapper.service.ProductService;
import fr.dlesaout.openfoodfactswrapper.util.ApiUrls;
import fr.dlesaout.openfoodfactswrapper.util.HttpHeadersUtil;
import fr.dlesaout.openfoodfactswrapper.util.JsonKeys;
import lombok.extern.slf4j.Slf4j;
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

    private final RestTemplate restTemplate;

    public ProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ProductResponse fetchProductByCode(String code) {
        HttpHeaders headers = HttpHeadersUtil.createHttpHeaders();
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        return restTemplate.exchange(String.format(ApiUrls.PRODUCT_BY_CODE.url, code), HttpMethod.GET, requestEntity, ProductResponse.class).getBody();
    }

    @Override
    public ProductList fetchProducts(String nutriscore, String category, String brand, Integer page) {
        HttpHeaders headers = HttpHeadersUtil.createHttpHeaders();
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        String url = buildUrlForSearch(nutriscore, category, brand, page);

        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<>() {
                }
        );

        return processResponse(responseEntity);
    }

    private String buildUrlForSearch(String nutriscore, String category, String brand, Integer page) {
        StringBuilder urlBuilder = new StringBuilder(ApiUrls.BASE_SEARCH.url);
        appendQueryParam(urlBuilder, JsonKeys.NUTRITION_GRADES_TAGS, nutriscore);
        appendQueryParam(urlBuilder, JsonKeys.CATEGORIES_TAGS, category);
        appendQueryParam(urlBuilder, JsonKeys.BRANDS_TAGS, brand);
        urlBuilder.append(JsonKeys.PAGE).append("=").append(page != null ? page : 1).append("&json=true");

        return urlBuilder.toString();
    }

    private void appendQueryParam(StringBuilder urlBuilder, String param, String value) {
        if (value != null) {
            urlBuilder.append(param).append("=").append(value).append("&");
        }
    }

    private ProductList processResponse(ResponseEntity<Map<String, Object>> responseEntity) {
        List<ProductResponse> productList = new ArrayList<>();
        Map<String, Object> body = responseEntity.getBody();

        if (body != null && !body.isEmpty()) {
            Object productListObj = body.get(JsonKeys.PRODUCTS);
            if (productListObj instanceof List) {
                @SuppressWarnings("unchecked")
                List<Map<String, Object>> tempList = (List<Map<String, Object>>) productListObj;
                List<ProductResponse> collectedResponses = tempList.parallelStream()
                        .filter(productMap -> productMap.containsKey(JsonKeys.CODE))
                        .map(productMap -> fetchProductByCode((String) productMap.get("code")))
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
            numberOfProducts = Integer.parseInt(body.get(JsonKeys.COUNT).toString());
            pageNumber = Integer.parseInt(body.get(JsonKeys.PAGE).toString());
            numberOfItemsInSelectedPage = Integer.parseInt(body.get(JsonKeys.PAGE_COUNT).toString());
            numberMaxOfItemsPerPage = Integer.parseInt(body.get(JsonKeys.PAGE_SIZE).toString());
        }

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCount(numberOfProducts);
        paginationInfo.setPage(pageNumber);
        paginationInfo.setPageCount(numberOfItemsInSelectedPage);
        paginationInfo.setPageSize(numberMaxOfItemsPerPage);

        return paginationInfo;
    }

}