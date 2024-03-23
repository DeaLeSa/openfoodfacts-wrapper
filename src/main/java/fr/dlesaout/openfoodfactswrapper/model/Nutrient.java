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
public class Nutrient {

    @JsonProperty("calcium")
    @Schema(description = "Amount of calcium.")
    private Double calcium;

    @JsonProperty("calciumValue")
    @Schema(description = "Value of calcium.")
    private Double calciumValue;

    @JsonProperty("calcium100G")
    @Schema(description = "Amount of calcium per 100g.")
    private Double calcium100G;

    @JsonProperty("calciumServing")
    @Schema(description = "Amount of calcium per serving.")
    private Double calciumServing;

    @JsonProperty("calciumUnit")
    @Schema(description = "Unit of calcium measurement.")
    private String calciumUnit;

    @JsonProperty("alcohol")
    @Schema(description = "Amount of alcohol.")
    private Double alcohol;

    @JsonProperty("alcoholValue")
    @Schema(description = "Value of alcohol.")
    private Double alcoholValue;

    @JsonProperty("alcohol100G")
    @Schema(description = "Amount of alcohol per 100g.")
    private Double alcohol100G;

    @JsonProperty("alcoholServing")
    @Schema(description = "Amount of alcohol per serving.")
    private Double alcoholServing;

    @JsonProperty("alcoholUnit")
    @Schema(description = "Unit of alcohol measurement.")
    private String alcoholUnit;

    @JsonProperty("carbohydrates")
    @Schema(description = "Amount of carbohydrates.")
    private Double carbohydrates;

    @JsonProperty("carbohydratesValue")
    @Schema(description = "Value of carbohydrates.")
    private Double carbohydratesValue;

    @JsonProperty("carbohydrates100G")
    @Schema(description = "Amount of carbohydrates per 100g.")
    private Double carbohydrates100G;

    @JsonProperty("carbohydratesServing")
    @Schema(description = "Amount of carbohydrates per serving.")
    private Double carbohydratesServing;

    @JsonProperty("carbohydratesUnit")
    @Schema(description = "Unit of carbohydrates measurement.")
    private String carbohydratesUnit;

    @JsonProperty("cholesterol")
    @Schema(description = "Amount of cholesterol.")
    private Double cholesterol;

    @JsonProperty("energy")
    @Schema(description = "Energy content.")
    private Integer energy;

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
    private Double energyKcalValueComputed;

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
    private Double energyKjValueComputed;

    @JsonProperty("fat")
    @Schema(description = "Amount of fat.")
    private Double fat;

    @JsonProperty("fatValue")
    @Schema(description = "Value of fat.")
    private Double fatValue;

    @JsonProperty("fat100g")
    @Schema(description = "Amount of fat per 100g.")
    private Double fat100g;

    @JsonProperty("fatPreparedUnit")
    @Schema(description = "Unit of fat prepared measurement.")
    private String fatPreparedUnit;

    @JsonProperty("fatServing")
    @Schema(description = "Amount of fat per serving.")
    private Double fatServing;

    @JsonProperty("fatUnit")
    @Schema(description = "Unit of fat measurement.")
    private String fatUnit;

    @JsonProperty("fiber")
    @Schema(description = "Amount of fiber.")
    private Double fiber;

    @JsonProperty("fiberValue")
    @Schema(description = "Value of fiber.")
    private Double fiberValue;

    @JsonProperty("fiber100g")
    @Schema(description = "Amount of fiber per 100g.")
    private Double fiber100g;

    @JsonProperty("fiberPreparedUnit")
    @Schema(description = "Unit of fiber prepared measurement.")
    private String fiberPreparedUnit;

    @JsonProperty("fiberServing")
    @Schema(description = "Amount of fiber per serving.")
    private Double fiberServing;

    @JsonProperty("fiberUnit")
    @Schema(description = "Unit of fiber measurement.")
    private String fiberUnit;

    @JsonProperty("iron")
    @Schema(description = "Amount of iron.")
    private Double iron;

    @JsonProperty("proteins")
    @Schema(description = "Amount of proteins.")
    private Double proteins;

    @JsonProperty("proteinsValue")
    @Schema(description = "Value of protein.")
    private Double proteinsValue;

    @JsonProperty("proteins100g")
    @Schema(description = "Amount of protein per 100g.")
    private Double proteins100g;

    @JsonProperty("proteinsPreparedUnit")
    @Schema(description = "Unit of protein prepared measurement.")
    private String proteinsPreparedUnit;

    @JsonProperty("proteinsServing")
    @Schema(description = "Amount of protein per serving.")
    private Double proteinsServing;

    @JsonProperty("proteinsUnit")
    @Schema(description = "Unit of protein measurement.")
    private String proteinsUnit;

    @JsonProperty("salt")
    @Schema(description = "Amount of salt.")
    private Double salt;

    @JsonProperty("saltValue")
    @Schema(description = "Value of salt.")
    private Double saltValue;

    @JsonProperty("salt100g")
    @Schema(description = "Amount of salt per 100g.")
    private Double salt100g;

    @JsonProperty("saltPreparedUnit")
    @Schema(description = "Unit of salt prepared measurement.")
    private String saltPreparedUnit;

    @JsonProperty("saltServing")
    @Schema(description = "Amount of salt per serving.")
    private Double saltServing;

    @JsonProperty("saltUnit")
    @Schema(description = "Unit of salt measurement.")
    private String saltUnit;

    @JsonProperty("sodium")
    @Schema(description = "Amount of sodium.")
    private Double sodium;

    @JsonProperty("sodiumValue")
    @Schema(description = "Value of sodium.")
    private Double sodiumValue;

    @JsonProperty("sodium100g")
    @Schema(description = "Amount of sodium per 100g.")
    private Double sodium100g;

    @JsonProperty("sodiumPreparedUnit")
    @Schema(description = "Unit of sodium prepared measurement.")
    private String sodiumPreparedUnit;

    @JsonProperty("sodiumServing")
    @Schema(description = "Amount of sodium per serving.")
    private Double sodiumServing;

    @JsonProperty("sodiumUnit")
    @Schema(description = "Unit of sodium measurement.")
    private String sodiumUnit;

    @JsonProperty("sugars")
    @Schema(description = "Amount of sugars.")
    private Double sugars;

    @JsonProperty("sugarsValue")
    @Schema(description = "Value of sugars.")
    private Double sugarsValue;

    @JsonProperty("sugars100g")
    @Schema(description = "Amount of sugars per 100g.")
    private Double sugars100g;

    @JsonProperty("sugarsPreparedUnit")
    @Schema(description = "Unit of sugars prepared measurement.")
    private String sugarsPreparedUnit;

    @JsonProperty("sugarsServing")
    @Schema(description = "Amount of sugars per serving.")
    private Double sugarsServing;

    @JsonProperty("sugarsUnit")
    @Schema(description = "Unit of sugars measurement.")
    private String sugarsUnit;

    @JsonProperty("vitaminA")
    @Schema(description = "Amount of vitamin A.")
    private Double vitaminA;

    @JsonProperty("vitaminC")
    @Schema(description = "Amount of vitamin C.")
    private Double vitaminC;

    @JsonProperty("vitaminD")
    @Schema(description = "Amount of vitamin D.")
    private Double vitaminD;

    @JsonProperty("carbonFootprintFromKnownIngredients100g")
    @Schema(description = "Carbon footprint from known ingredients per 100g.")
    private Double carbonFootprintFromKnownIngredients100g;

    @JsonProperty("carbonFootprintFromKnownIngredientsProduct")
    @Schema(description = "Total carbon footprint from known ingredients for the product.")
    private Double carbonFootprintFromKnownIngredientsProduct;

    @JsonProperty("carbonFootprintFromKnownIngredientsServing")
    @Schema(description = "Carbon footprint from known ingredients per serving.")
    private Double carbonFootprintFromKnownIngredientsServing;

    @JsonProperty("fruitsVegetablesLegumesEstimateFromIngredients100g")
    @Schema(description = "Estimate of fruits, vegetables, and legumes from ingredients per 100g.")
    private Double fruitsVegetablesLegumesEstimateFromIngredients100g;

    @JsonProperty("fruitsVegetablesLegumesEstimateFromIngredientsServing")
    @Schema(description = "Estimate of fruits, vegetables, and legumes from ingredients per serving.")
    private Double fruitsVegetablesLegumesEstimateFromIngredientsServing;

    @JsonProperty("fruitsVegetablesNutsEstimateFromIngredients100g")
    @Schema(description = "Estimate of fruits, vegetables, and nuts from ingredients per 100g.")
    private Double fruitsVegetablesNutsEstimateFromIngredients100g;

    @JsonProperty("fruitsVegetablesNutsEstimateFromIngredientsServing")
    @Schema(description = "Estimate of fruits, vegetables, and nuts from ingredients per serving.")
    private Double fruitsVegetablesNutsEstimateFromIngredientsServing;

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
    private Double saturatedFat;

    @JsonProperty("saturatedFat100g")
    @Schema(description = "Amount of saturated fat per 100g.")
    private Double saturatedFat100g;

    @JsonProperty("saturatedFatServing")
    @Schema(description = "Amount of saturated fat per serving.")
    private Double saturatedFatServing;

    @JsonProperty("saturatedFatUnit")
    @Schema(description = "Unit of saturated fat measurement.")
    private String saturatedFatUnit;

    @JsonProperty("saturatedFatValue")
    @Schema(description = "Value of saturated fat.")
    private Double saturatedFatValue;

}