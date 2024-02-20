package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("count")
    @Schema(description = "Number of products.")
    private Integer count;

    @Schema(description = "List of products.")
    private List<Product> products;

}