package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import fr.dlesaout.openfoodfactswrapper.model.Agribalyse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
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

    @JsonProperty("ecoScoreNotApplicableForCategory")
    @Schema(description = "Reason why eco-score is not applicable for the category of the product.")
    private String ecoScoreNotApplicableForCategory;

    @JsonProperty("missing")
    @Schema(description = "Information about missing data related to the eco-score.")
    private MissingData missing;

    @JsonProperty("scores")
    @Schema(description = "Map of scores associated with the product.")
    private Map<String, Object> scores;

    @JsonProperty("status")
    @Schema(description = "Current status of the product's eco-score.")
    private String status;

    @JsonProperty("ecoScoreGrade")
    @Schema(description = "The eco-score grade (e.g., 'A', 'B', 'C', etc.) representing the environmental impact of the product.")
    private String ecoScoreGrade;

    @JsonProperty("ecoScoreScore")
    @Schema(description = "The numerical eco-score value, quantifying the environmental impact of the product.")
    private int ecoScoreScore;

    @JsonProperty("ecoScoreTags")
    @Schema(description = "A list of tags providing additional information on the environmental impact factors of the product.")
    private List<String> ecoScoreTags;

    @JsonProperty("agribalyse")
    @Schema(description = "Holds detailed environmental impact data of the product according to the Agribalyse database, including CO2 emissions, environmental footprint, and other impact metrics across different stages of the product's lifecycle.")
    private Agribalyse agribalyse;

}

