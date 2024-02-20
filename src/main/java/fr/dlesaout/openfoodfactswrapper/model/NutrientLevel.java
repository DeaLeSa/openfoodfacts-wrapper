package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("NutrientLevel")
@Schema(description = "Nutrient levels of a product, indicating the levels of fat, salt, saturated fat, and sugars.")
@Data
@NoArgsConstructor
public class NutrientLevel {

  @Schema(description = "Level of fat in the product, which could be low, medium, or high.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fat")
  private String fat;

  @Schema(description = "Level of salt in the product, which could be low, medium, or high.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salt")
  private String salt;

  @Schema(description = "Level of saturated fat in the product, which could be low, medium, or high.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("saturated_fat")
  private String saturatedFat;

  @Schema(description = "Level of sugars in the product, which could be low, medium, or high.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sugars")
  private String sugars;

}