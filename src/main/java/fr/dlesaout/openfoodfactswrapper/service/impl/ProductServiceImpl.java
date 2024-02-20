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

        String url = String.format(ApiUrls.PRODUCT_BY_CODE_URL.url, code);
        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, ProductResponse.class).getBody();
    }

    @Override
    public ProductList fetchProducts(String nutriscore, String category, String brand, Integer page) {
        HttpHeaders headers = HttpHeadersUtil.createHttpHeaders();
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        String url = String.format(ApiUrls.PRODUCTS_LIST_URL.url, nutriscore, category, brand, page);
        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<>() {}
        );

        ProductList productList = new ProductList();
        List<Product> productsInProductList = new ArrayList<>();
        if (responseEntity.getBody() != null) {
            List<Map<String, Object>> products = (List<Map<String, Object>>) responseEntity.getBody().get("products");
            if (products != null) {
                for (Map<String, Object> productMap : products) {
                    ObjectMapper objectMapper = new ObjectMapper();
                    Product product = objectMapper.convertValue(productMap, Product.class);
                    productsInProductList.add(product);
                }
            }
        }

        productList.setProducts(productsInProductList);

        return productList;
    }

}