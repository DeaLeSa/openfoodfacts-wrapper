package fr.dlesaout.openfoodfactswrapper.service;

import fr.dlesaout.openfoodfactswrapper.model.ProductList;
import fr.dlesaout.openfoodfactswrapper.model.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse fetchProductByCode(String code, List<String> fields);

    ProductList fetchProducts(String nutriscore, String category, String brand, List<String> fields, Integer page);

}
