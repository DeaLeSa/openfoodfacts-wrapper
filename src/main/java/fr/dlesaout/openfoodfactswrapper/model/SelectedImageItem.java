package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("SelectedImageItem")
@Schema(description = "Represents an item of selected images with different language versions.")
@Data
@NoArgsConstructor
public class SelectedImageItem {

  @Schema(description = "The URL of the image for the English language version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("en")
  private String en;

  @Schema(description = "The URL of the image for the French language version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fr")
  private String fr;

  @Schema(description = "The URL of the image for the Polish language version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pl")
  private String pl;

}