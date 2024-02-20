package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(description = "IngredientProductList")
@JsonTypeName("IngredientProductList")
@Data
@NoArgsConstructor
public class IngredientProductList {

    @Schema(description = "The CIQUAL proxy food code for the ingredient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ciqual_proxy_food_code")
    private String ciqualProxyFoodCode;

    @Schema(description = "The unique identifier for the ingredient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    private String id;

    @Schema(description = "The estimated percentage of the ingredient in the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("percent_estimate")
    private BigDecimal percentEstimate;

    @Schema(description = "The maximum percentage of the ingredient in the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("percent_max")
    private BigDecimal percentMax;

    @Schema(description = "The minimum percentage of the ingredient in the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("percent_min")
    private BigDecimal percentMin;

    @Schema(description = "The name or description of the ingredient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text")
    private String text;

    @Schema(description = "Indicates if the ingredient is suitable for vegans.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vegan")
    private String vegan;

    @Schema(description = "Indicates if the ingredient is suitable for vegetarians.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vegetarian")
    private String vegetarian;

}