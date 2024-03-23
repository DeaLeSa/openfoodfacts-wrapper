package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Ingredient")
@JsonTypeName("Ingredient")
@Data
@NoArgsConstructor
public class Ingredient {

    @Schema(description = "The ciqual proxy food score of the ingredient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ciqualProxyFoodScore")
    private String ciqualProxyFoodScore;

    @Schema(description = "Indicates if the ingredient is from palm oil.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fromPalmOil")
    private String fromPalmOil;

    @Schema(description = "The unique identifier for the ingredient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    private String id;

    @Schema(description = "The origin of the ingredient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("origin")
    private String origin;

    @Schema(description = "The percentage of this ingredient in the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("percent")
    private Double percent;

    @JsonProperty("percentEstimate")
    private Double percentEstimate;

    @JsonProperty("percentMax")
    private Double percentMax;

    @JsonProperty("percentMin")
    private Double percentMin;

    @Schema(description = "The rank or order of the ingredient in the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rank")
    private Integer rank;

    @Schema(description = "The text description of the ingredient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text")
    private String text;

    @Schema(description = "Indicates if the ingredient is vegan.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vegan")
    private String vegan;

    @Schema(description = "Indicates if the ingredient is vegetarian.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vegetarian")
    private String vegetarian;

    @Schema(description = "Sublist of ingredients.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ingredients")
    private List<Ingredient> ingredients;

}