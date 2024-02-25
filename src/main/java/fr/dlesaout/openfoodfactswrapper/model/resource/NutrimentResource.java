package fr.dlesaout.openfoodfactswrapper.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("NutrimentResource")
@Schema(name = "NutrimentResource", description = "Nutritional values for various components of a product.")
@Data
@NoArgsConstructor
public class NutrimentResource {

    @JsonProperty("calcium")
    @Schema(description = "Amount of calcium.")
    private Float calcium;

    @JsonProperty("calcium_value")
    @Schema(description = "Value of calcium.")
    private Float calciumValue;

    @JsonProperty("calcium_100g")
    @Schema(description = "Amount of calcium per 100g.")
    private Float calcium100G;

    @JsonProperty("calcium_serving")
    @Schema(description = "Amount of calcium per serving.")
    private Float calciumServing;

    @JsonProperty("calcium_unit")
    @Schema(description = "Unit of calcium measurement.")
    private String calciumUnit;

    @JsonProperty("carbohydrates")
    @Schema(description = "Amount of carbohydrates.")
    private Float carbohydrates;

    @JsonProperty("carbohydrates_value")
    @Schema(description = "Value of carbohydrates.")
    private Float carbohydratesValue;

    @JsonProperty("carbohydrates_100g")
    @Schema(description = "Amount of carbohydrates per 100g.")
    private Float carbohydrates100G;

    @JsonProperty("carbohydrates_serving")
    @Schema(description = "Amount of carbohydrates per serving.")
    private Float carbohydratesServing;

    @JsonProperty("carbohydrates_unit")
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

    @JsonProperty("carbon-footprint-from-known-ingredients_100g")
    @Schema(description = "Carbon footprint from known ingredients per 100g.")
    private Float carbonFootprintFromKnownIngredients100g;

    @JsonProperty("carbon-footprint-from-known-ingredients_product")
    @Schema(description = "Total carbon footprint from known ingredients for the product.")
    private Float carbonFootprintFromKnownIngredientsProduct;

    @JsonProperty("carbon-footprint-from-known-ingredients_serving")
    @Schema(description = "Carbon footprint from known ingredients per serving.")
    private Float carbonFootprintFromKnownIngredientsServing;

    @JsonProperty("energy-kcal")
    @Schema(description = "Energy content in kcal.")
    private Integer energyKcal;

    @JsonProperty("energy-kcal_100g")
    @Schema(description = "Energy content in kcal per 100g.")
    private Integer energyKcal100g;

    @JsonProperty("energy-kcal_serving")
    @Schema(description = "Energy content in kcal per serving.")
    private Integer energyKcalServing;

    @JsonProperty("energy-kcal_unit")
    @Schema(description = "Unit of energy measurement in kcal.")
    private String energyKcalUnit;

    @JsonProperty("energy-kcal_value")
    @Schema(description = "Energy value in kcal.")
    private Integer energyKcalValue;

    @JsonProperty("energy-kcal_value_computed")
    @Schema(description = "Computed energy value in kcal.")
    private Float energyKcalValueComputed;

    @JsonProperty("energy-kj")
    @Schema(description = "Energy content in kJ.")
    private Integer energyKj;

    @JsonProperty("energy-kj_100g")
    @Schema(description = "Energy content in kJ per 100g.")
    private Integer energyKj100g;

    @JsonProperty("energy-kj_serving")
    @Schema(description = "Energy content in kJ per serving.")
    private Integer energyKjServing;

    @JsonProperty("energy-kj_unit")
    @Schema(description = "Unit of energy measurement in kJ.")
    private String energyKjUnit;

    @JsonProperty("energy-kj_value")
    @Schema(description = "Energy value in kJ.")
    private Integer energyKjValue;

    @JsonProperty("energy-kj_value_computed")
    @Schema(description = "Computed energy value in kJ.")
    private Float energyKjValueComputed;

    @JsonProperty("fruits-vegetables-legumes-estimate-from-ingredients_100g")
    @Schema(description = "Estimate of fruits, vegetables, and legumes from ingredients per 100g.")
    private Float fruitsVegetablesLegumesEstimateFromIngredients100g;

    @JsonProperty("fruits-vegetables-legumes-estimate-from-ingredients_serving")
    @Schema(description = "Estimate of fruits, vegetables, and legumes from ingredients per serving.")
    private Float fruitsVegetablesLegumesEstimateFromIngredientsServing;

    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    @Schema(description = "Estimate of fruits, vegetables, and nuts from ingredients per 100g.")
    private Float fruitsVegetablesNutsEstimateFromIngredients100g;

    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_serving")
    @Schema(description = "Estimate of fruits, vegetables, and nuts from ingredients per serving.")
    private Float fruitsVegetablesNutsEstimateFromIngredientsServing;

    @JsonProperty("nova-group")
    @Schema(description = "NOVA group classification.")
    private Integer novaGroup;

    @JsonProperty("nova-group_100g")
    @Schema(description = "NOVA group classification per 100g.")
    private Integer novaGroup100g;

    @JsonProperty("nova-group_serving")
    @Schema(description = "NOVA group classification per serving.")
    private Integer novaGroupServing;

    @JsonProperty("nutrition-score-fr")
    @Schema(description = "French nutrition score.")
    private Integer nutritionScoreFr;

    @JsonProperty("nutrition-score-fr_100g")
    @Schema(description = "French nutrition score per 100g.")
    private Integer nutritionScoreFr100g;

    @JsonProperty("saturated-fat")
    @Schema(description = "Amount of saturated fat.")
    private Float saturatedFat;

    @JsonProperty("saturated-fat_100g")
    @Schema(description = "Amount of saturated fat per 100g.")
    private Float saturatedFat100g;

    @JsonProperty("saturated-fat_serving")
    @Schema(description = "Amount of saturated fat per serving.")
    private Float saturatedFatServing;

    @JsonProperty("saturated-fat_unit")
    @Schema(description = "Unit of saturated fat measurement.")
    private String saturatedFatUnit;

    @JsonProperty("saturated-fat_value")
    @Schema(description = "Value of saturated fat.")
    private Float saturatedFatValue;

}