package fr.dlesaout.openfoodfactswrapper.model.resource.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("AjustmentResource")
@Schema(name = "AjustmentResource", description = "Adjustments made to the eco-score of the product.")
public class AdjustmentResource {

    @JsonProperty("origins_of_ingredients")
    @Schema(description = "Adjustments related to the origins of ingredients.")
    private OriginIngredientResource originsOfIngredients;

    @JsonProperty("packaging")
    @Schema(description = "Adjustments related to the packaging of the product.")
    private PackagingResource packaging;

    @JsonProperty("production_system")
    @Schema(description = "Adjustments related to the production system of the product.")
    private ProductionSystemResource productionSystem;

    @JsonProperty("threatened_species")
    @Schema(description = "Adjustments related to threatened species in the product.")
    private ThreatenedSpecyResource threatenedSpecies;

}
