package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ProductResponse")
@Schema(description = "ProductResponse")
@Data
@NoArgsConstructor
public class ProductResponse {

  @Valid
  @Schema(description = "Product details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product")
  private Product product;

  @Schema(description = "The unique code identifying the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  private String code;

  @Schema(description = "Boolean status indicating the success or failure of the product retrieval.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  private Boolean status;

  @Schema(description = "A verbose explanation of the status, providing more details about the result of the product retrieval.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusVerbose")
  private String statusVerbose;

}