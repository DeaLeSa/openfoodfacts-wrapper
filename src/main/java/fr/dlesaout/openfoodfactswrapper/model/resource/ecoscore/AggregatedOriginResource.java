package fr.dlesaout.openfoodfactswrapper.model.resource.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("AggregatedOriginResource")
@Schema(name = "AggregatedOriginResource", description = "Nutritional values for various components of a product.")
@Data
@NoArgsConstructor
public class AggregatedOriginResource {

    @JsonProperty("epi_score")
    @Schema(description = "Eco-Score Index (EPI) of the product.", format = "string")
    private String epiScore;

    @JsonProperty("origin")
    @Schema(description = "Country of origin for the product.")
    private String origin;

    @JsonProperty("percent")
    @Schema(description = "Percentage of the specified origin in the total origins of ingredients.", example = "100")
    private int percent;

    @JsonProperty("transportation_score")
    @Schema(description = "Transportation score indicating environmental impact related to transportation.", format = "string")
    private String transportationScore;

}
