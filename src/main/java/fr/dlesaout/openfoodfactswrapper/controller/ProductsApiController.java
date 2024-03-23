package fr.dlesaout.openfoodfactswrapper.controller;

import fr.dlesaout.openfoodfactswrapper.model.ProductList;
import fr.dlesaout.openfoodfactswrapper.model.ProductResponse;
import fr.dlesaout.openfoodfactswrapper.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class ProductsApiController implements ProductsApi {

    private final ProductService productService;

    @Autowired
    public ProductsApiController(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<ProductResponse> fetchProductByCode(String code) {
        return ResponseEntity.ok(productService.fetchProductByCode(code));
    }

    @Override
    public ResponseEntity<ProductList> fetchProducts(String nutriscore, String category, String brand, Integer page) {
        return ResponseEntity.ok(productService.fetchProducts(nutriscore, category, brand, page));
    }

}
