package fr.dlesaout.openfoodfactswrapper.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("AllergenResource")
@Schema(description = "AllergenResource")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllergenResource {

    @JsonProperty("traces")
    @Schema(description = "Traces present in the product")
    private String traces;

    @JsonProperty("allergens")
    @Schema(description = "Allergens present in the product")
    private String allergens;

    @JsonProperty("allergens_from_ingredients")
    @Schema(description = "Allergens from ingredients")
    private String allergensFromIngredients;

    @JsonProperty("allergens_from_user")
    @Schema(description = "Allergens reported by the user")
    private String allergensFromUser;

    @JsonProperty("allergens_hierarchy")
    @Schema(description = "Hierarchy of allergens")
    private String[] allergensHierarchy;

    @JsonProperty("allergens_lc")
    @Schema(description = "Language code for allergens information")
    private String allergensLc;

    @JsonProperty("allergens_tags")
    @Schema(description = "Tags for allergens")
    private String[] allergensTags;

}
