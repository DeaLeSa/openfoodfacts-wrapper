package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@JsonTypeName("Products")
@Schema(name = "Products", description = "Represents a list of products with detailed information.")
public class ProductList {

    private PaginationInfo paginationInfo;

    private List<Product> products;

}