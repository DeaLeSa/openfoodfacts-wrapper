package fr.dlesaout.openfoodfactswrapper.model.resource.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("OriginIngredientResource")
@Schema(name = "OriginIngredientResource", description = "Resource representing information about the origin of ingredients in the product.")
public class OriginIngredientResource {

    @JsonProperty("aggregated_origins")
    @Schema(description = "List of aggregated origins of ingredients in the product.")
    private List<AggregatedOriginResource> aggregatedOrigins;

    @JsonProperty("epi_score")
    @Schema(description = "EPI score of the product.", example = "93")
    private int epiScore;

    @JsonProperty("epi_value")
    @Schema(description = "EPI value of the product.", example = "4")
    private int epiValue;

    @JsonProperty("origins_from_categories")
    @Schema(description = "List of categories representing origins of ingredients.")
    private List<String> originsFromCategories;

    @JsonProperty("origins_from_origins_field")
    @Schema(description = "List of origins extracted from the 'origins' field.")
    private List<String> originsFromOriginsField;

    @JsonProperty("transportation_score")
    @Schema(description = "Transportation score of the product.", example = "100")
    private int transportationScore;

    @JsonProperty("transportation_scores")
    @Schema(description = "Map of transportation scores for different regions.")
    private Map<String, Integer> transportationScores;

    @JsonProperty("transportation_value")
    @Schema(description = "Transportation value of the product.", example = "15")
    private int transportationValue;

    @JsonProperty("transportation_values")
    @Schema(description = "Map of transportation values for different regions.")
    private Map<String, Integer> transportationValues;

    @JsonProperty("value")
    @Schema(description = "Value representing the origin of ingredients.", example = "19")
    private int value;

    @JsonProperty("values")
    @Schema(description = "Map of values for different regions.")
    private Map<String, Integer> values;

}