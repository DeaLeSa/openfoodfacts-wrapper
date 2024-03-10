package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("EcoScore")
@Schema(name = "EcoScore", description = "Data related to the eco-score of the product.")
public class EcoScore {

    @JsonProperty("adjustments")
    @Schema(description = "Adjustments made to the eco-score of the product.")
    private Adjustment adjustments;

    @JsonProperty("ecoscoreNotApplicableForCategory")
    @Schema(description = "Reason why eco-score is not applicable for the category of the product.")
    private String ecoscoreNotApplicableForCategory;

    @JsonProperty("missing")
    @Schema(description = "Information about missing data related to the eco-score.")
    private MissingData missing;

    @JsonProperty("scores")
    @Schema(description = "Map of scores associated with the product.")
    private Map<String, Object> scores;

    @JsonProperty("status")
    @Schema(description = "Current status of the product's eco-score.")
    private String status;

}

