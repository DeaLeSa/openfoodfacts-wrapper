package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeName("Nutriment")
@Schema(name = "Nutriment", description = "Nutritional values for various components of a product.")
@Data
@NoArgsConstructor
public class Nutriment {

    @JsonProperty("calcium")
    @Schema(description = "Amount of calcium.")
    private Float calcium;

    @JsonProperty("calciumValue")
    @Schema(description = "Value of calcium.")
    private Float calciumValue;

    @JsonProperty("calcium100G")
    @Schema(description = "Amount of calcium per 100g.")
    private Float calcium100G;

    @JsonProperty("calciumServing")
    @Schema(description = "Amount of calcium per serving.")
    private Float calciumServing;

    @JsonProperty("calciumUnit")
    @Schema(description = "Unit of calcium measurement.")
    private String calciumUnit;

    @JsonProperty("carbohydrates")
    @Schema(description = "Amount of carbohydrates.")
    private Float carbohydrates;

    @JsonProperty("carbohydratesValue")
    @Schema(description = "Value of carbohydrates.")
    private Float carbohydratesValue;

    @JsonProperty("carbohydrates100G")
    @Schema(description = "Amount of carbohydrates per 100g.")
    private Float carbohydrates100G;

    @JsonProperty("carbohydratesServing")
    @Schema(description = "Amount of carbohydrates per serving.")
    private Float carbohydratesServing;

    @JsonProperty("carbohydratesUnit")
    @Schema(description = "Unit of carbohydrates measurement.")
    private String carbohydratesUnit;

    @JsonProperty("cholesterol")
    @Schema(description = "Amount of cholesterol.")
    private Float cholesterol;

    @JsonProperty("energy")
    @Schema(description = "Energy content.")
    private Integer energy;

    @JsonProperty("fat")
    @Schema(description = "Amount of fat.")
    private Float fat;

    @JsonProperty("fiber")
    @Schema(description = "Amount of fiber.")
    private Float fiber;

    @JsonProperty("iron")
    @Schema(description = "Amount of iron.")
    private Float iron;

    @JsonProperty("proteins")
    @Schema(description = "Amount of proteins.")
    private Float proteins;

    @JsonProperty("salt")
    @Schema(description = "Amount of salt.")
    private Float salt;

    @JsonProperty("sugars")
    @Schema(description = "Amount of sugars.")
    private Float sugars;

    @JsonProperty("vitaminA")
    @Schema(description = "Amount of vitamin A.")
    private Float vitaminA;

    @JsonProperty("vitaminC")
    @Schema(description = "Amount of vitamin C.")
    private Float vitaminC;

    @JsonProperty("vitaminD")
    @Schema(description = "Amount of vitamin D.")
    private Float vitaminD;

    @JsonProperty("carbonFootprintFromKnownIngredients100g")
    @Schema(description = "Carbon footprint from known ingredients per 100g.")
    private Float carbonFootprintFromKnownIngredients100g;

    @JsonProperty("carbonFootprintFromKnownIngredientsProduct")
    @Schema(description = "Total carbon footprint from known ingredients for the product.")
    private Float carbonFootprintFromKnownIngredientsProduct;

    @JsonProperty("carbonFootprintFromKnownIngredientsServing")
    @Schema(description = "Carbon footprint from known ingredients per serving.")
    private Float carbonFootprintFromKnownIngredientsServing;

    @JsonProperty("energyKcal")
    @Schema(description = "Energy content in kcal.")
    private Integer energyKcal;

    @JsonProperty("energyKcal100g")
    @Schema(description = "Energy content in kcal per 100g.")
    private Integer energyKcal100g;

    @JsonProperty("energyKcalServing")
    @Schema(description = "Energy content in kcal per serving.")
    private Integer energyKcalServing;

    @JsonProperty("energyKcalUnit")
    @Schema(description = "Unit of energy measurement in kcal.")
    private String energyKcalUnit;

    @JsonProperty("energyKcalValue")
    @Schema(description = "Energy value in kcal.")
    private Integer energyKcalValue;

    @JsonProperty("energyKcalValueComputed")
    @Schema(description = "Computed energy value in kcal.")
    private Float energyKcalValueComputed;

    @JsonProperty("energyKj")
    @Schema(description = "Energy content in kJ.")
    private Integer energyKj;

    @JsonProperty("energyKj100g")
    @Schema(description = "Energy content in kJ per 100g.")
    private Integer energyKj100g;

    @JsonProperty("energyKjServing")
    @Schema(description = "Energy content in kJ per serving.")
    private Integer energyKjServing;

    @JsonProperty("energyKjUnit")
    @Schema(description = "Unit of energy measurement in kJ.")
    private String energyKjUnit;

    @JsonProperty("energyKjValue")
    @Schema(description = "Energy value in kJ.")
    private Integer energyKjValue;

    @JsonProperty("energyKjValueComputed")
    @Schema(description = "Computed energy value in kJ.")
    private Float energyKjValueComputed;

    @JsonProperty("fruitsVegetablesLegumesEstimateFromIngredients100g")
    @Schema(description = "Estimate of fruits, vegetables, and legumes from ingredients per 100g.")
    private Float fruitsVegetablesLegumesEstimateFromIngredients100g;

    @JsonProperty("fruitsVegetablesLegumesEstimateFromIngredientsServing")
    @Schema(description = "Estimate of fruits, vegetables, and legumes from ingredients per serving.")
    private Float fruitsVegetablesLegumesEstimateFromIngredientsServing;

    @JsonProperty("fruitsVegetablesNutsEstimateFromIngredients100g")
    @Schema(description = "Estimate of fruits, vegetables, and nuts from ingredients per 100g.")
    private Float fruitsVegetablesNutsEstimateFromIngredients100g;

    @JsonProperty("fruitsVegetablesNutsEstimateFromIngredientsServing")
    @Schema(description = "Estimate of fruits, vegetables, and nuts from ingredients per serving.")
    private Float fruitsVegetablesNutsEstimateFromIngredientsServing;

    @JsonProperty("novaGroup")
    @Schema(description = "NOVA group classification.")
    private Integer novaGroup;

    @JsonProperty("novaGroup100g")
    @Schema(description = "NOVA group classification per 100g.")
    private Integer novaGroup100g;

    @JsonProperty("novaGroupServing")
    @Schema(description = "NOVA group classification per serving.")
    private Integer novaGroupServing;

    @JsonProperty("nutritionScoreFr")
    @Schema(description = "French nutrition score.")
    private Integer nutritionScoreFr;

    @JsonProperty("nutritionScoreFr100g")
    @Schema(description = "French nutrition score per 100g.")
    private Integer nutritionScoreFr100g;

    @JsonProperty("saturatedFat")
    @Schema(description = "Amount of saturated fat.")
    private Float saturatedFat;

    @JsonProperty("saturatedFat100g")
    @Schema(description = "Amount of saturated fat per 100g.")
    private Float saturatedFat100g;

    @JsonProperty("saturatedFatServing")
    @Schema(description = "Amount of saturated fat per serving.")
    private Float saturatedFatServing;

    @JsonProperty("saturatedFatUnit")
    @Schema(description = "Unit of saturated fat measurement.")
    private String saturatedFatUnit;

    @JsonProperty("saturatedFatValue")
    @Schema(description = "Value of saturated fat.")
    private Float saturatedFatValue;

}