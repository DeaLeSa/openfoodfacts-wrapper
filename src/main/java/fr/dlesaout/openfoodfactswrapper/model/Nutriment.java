package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
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

}