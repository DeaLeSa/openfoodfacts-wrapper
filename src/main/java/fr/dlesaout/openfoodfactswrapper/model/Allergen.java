package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Accessors(chain = true)
@JsonTypeName("Allergen")
@Schema(description = "Allergen")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Allergen {

    @JsonProperty("traces")
    @Schema(description = "Traces present in the product")
    private String traces;

    @JsonProperty("allergensInProduct")
    @Schema(description = "Allergens present in the product")
    private String allergens;

    @JsonProperty("allergensFromIngredients")
    @Schema(description = "Allergens from ingredients")
    private String allergensFromIngredients;

    @JsonProperty("allergensHierarchy")
    @Schema(description = "Hierarchy of allergens")
    private List<String> allergensHierarchy;

    @JsonProperty("allergensLc")
    @Schema(description = "Language code for allergens information")
    private String allergensLc;

    @JsonProperty("allergensTags")
    @Schema(description = "Tags for allergens")
    private List<String> allergensTags;

}
