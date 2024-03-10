package fr.dlesaout.openfoodfactswrapper.controller;

import fr.dlesaout.openfoodfactswrapper.model.ProductList;
import fr.dlesaout.openfoodfactswrapper.model.ProductResponse;
import fr.dlesaout.openfoodfactswrapper.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/")
public class ProductsApiController implements ProductsApi {

    private final ProductService productService;

    @Autowired
    public ProductsApiController(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<ProductResponse> fetchProductByCode(String code, List<String> fields) {
        return ResponseEntity.ok(productService.fetchProductByCode(code, fields));
    }

    @Override
    public ResponseEntity<ProductList> fetchProducts(String nutriscore, String category, String brand, List<String> fields, Integer page) {
        return ResponseEntity.ok(productService.fetchProducts(nutriscore, category, brand, fields, page));
    }

}
