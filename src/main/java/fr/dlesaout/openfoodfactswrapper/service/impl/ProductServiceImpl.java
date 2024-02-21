package fr.dlesaout.openfoodfactswrapper.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.dlesaout.openfoodfactswrapper.model.Product;
import fr.dlesaout.openfoodfactswrapper.model.ProductList;
import fr.dlesaout.openfoodfactswrapper.model.ProductResponse;
import fr.dlesaout.openfoodfactswrapper.service.ProductService;
import fr.dlesaout.openfoodfactswrapper.util.ApiUrls;
import fr.dlesaout.openfoodfactswrapper.util.HttpHeadersUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
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

        String url = String.format(ApiUrls.PRODUCT_BY_CODE.url, code);
        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, ProductResponse.class).getBody();
    }

    @Override
    public ProductList fetchProducts(String nutriscore, String category, String brand, Integer page) {
        HttpHeaders headers = HttpHeadersUtil.createHttpHeaders();
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        String url = buildUrl(nutriscore, category, brand, page);

        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<>() {
                }
        );

        return processResponse(responseEntity);
    }

    private String buildUrl(String nutriscore, String category, String brand, Integer page) {
        StringBuilder urlBuilder = new StringBuilder(ApiUrls.BASE_SEARCH.url);
        appendQueryParam(urlBuilder, "nutrition_grades_tags", nutriscore);
        appendQueryParam(urlBuilder, "categories_tags", category);
        appendQueryParam(urlBuilder, "brands_tags", brand);
        urlBuilder.append("page=").append(page != null ? page : 1).append("&json=true");

        return urlBuilder.toString();
    }

    private void appendQueryParam(StringBuilder urlBuilder, String param, String value) {
        if (value != null) {
            urlBuilder.append(param).append("=").append(value).append("&");
        }
    }

    private ProductList processResponse(ResponseEntity<Map<String, Object>> responseEntity) {
        List<Product> productsInProductList = new ArrayList<>();
        if (responseEntity.getBody() != null) {
            List<Map<String, Object>> products = (List<Map<String, Object>>) responseEntity.getBody().get("products");
            if (products != null) {
                ObjectMapper objectMapper = new ObjectMapper();
                products.forEach(productMap ->
                        productsInProductList.add(objectMapper.convertValue(productMap, Product.class))
                );
            }
        }

        ProductList productList = new ProductList();
        productList.setProducts(productsInProductList);
        return productList;
    }


}