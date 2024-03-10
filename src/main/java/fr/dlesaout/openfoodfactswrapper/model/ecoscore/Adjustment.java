package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("AjustmentResource")
@Schema(name = "AjustmentResource", description = "Adjustments made to the eco-score of the product.")
public class Adjustment {

    @JsonProperty("originsOfIngredients")
    @Schema(description = "Adjustments related to the origins of ingredients.")
    private OriginIngredient originsOfIngredients;

    @JsonProperty("packaging")
    @Schema(description = "Adjustments related to the packaging of the product.")
    private Packaging packaging;

    @JsonProperty("productionSystem")
    @Schema(description = "Adjustments related to the production system of the product.")
    private ProductionSystem productionSystem;

    @JsonProperty("threatenedSpecies")
    @Schema(description = "Adjustments related to threatened species in the product.")
    private ThreatenedSpecy threatenedSpecies;

}
