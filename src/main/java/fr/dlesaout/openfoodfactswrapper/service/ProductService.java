package fr.dlesaout.openfoodfactswrapper.service;

import fr.dlesaout.openfoodfactswrapper.model.ProductList;
import fr.dlesaout.openfoodfactswrapper.model.ProductResponse;

public interface ProductService {

    ProductResponse fetchProductByCode(String code);

    ProductList fetchProducts(String nutriscore, String category, String brand, Integer page);

}
