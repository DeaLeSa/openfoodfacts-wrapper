package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ImpactResource")
@Schema(name = "ImpactResource", description = "Resource representing impact information of uncharacterized ingredients in the product.")
@Data
@NoArgsConstructor
public class Impact {

    @JsonProperty("efSingleScoreLogStddev")
    @Schema(description = "Standard deviation of the single environmental score.", example = "0.0138341440211297")
    private double efSingleScoreLogStddev;

    @JsonProperty("likeliestImpacts")
    @Schema(description = "Map of likeliest environmental impacts with their probabilities.")
    private Map<String, Double> likeliestImpacts;

    @JsonProperty("likeliestRecipe")
    @Schema(description = "Map of likeliest recipe with their probabilities.")
    private Map<String, Double> likeliestRecipe;

    @JsonProperty("massRatioUncharacterized")
    @Schema(description = "Ratio of uncharacterized ingredients mass to the total mass of the product.")
    private int massRatioUncharacterized;

    @JsonProperty("uncharacterizedIngredients")
    @Schema(description = "Resource containing information about uncharacterized ingredients.")
    private UncharacterizedIngredient uncharacterizedIngredients;

    @JsonProperty("uncharacterizedIngredientsMassProportion")
    @Schema(description = "Proportion of uncharacterized ingredients mass compared to the total mass of the product.", example = "0.5")
    private double uncharacterizedIngredientsMassProportion;

    @JsonProperty("uncharacterizedIngredientsRatio")
    @Schema(description = "Ratio of uncharacterized ingredients to the total number of ingredients.", example = "0.3")
    private double uncharacterizedIngredientsRatio;

    @JsonProperty("warnings")
    @Schema(description = "List of warnings related to the impact.")
    private List<String> warnings;

}
