package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("Source")
@Schema(description = "Represents a source of product information.")
@Data
@NoArgsConstructor
public class Source {

  @Valid
  @JsonProperty("fields")
  @Schema(description = "The list of fields associated with the source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  private List<String> fields = new ArrayList<>();

  @JsonProperty("id")
  @Schema(description = "The unique identifier for the source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  private String id;

  @Valid
  @JsonProperty("images")
  @Schema(description = "The list of image URLs or identifiers associated with the source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  private List<String> images = new ArrayList<>();

  @JsonProperty("import_t")
  @Schema(description = "The timestamp representing when the source was imported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  private Long importT;

  @JsonProperty("manufacturer")
  @Schema(description = "The name of the manufacturer associated with the source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  private String manufacturer;

  @JsonProperty("name")
  @Schema(description = "The name of the source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  private String name;

  @JsonProperty("url")
  @Schema(description = "The URL associated with the source, if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  private String url;

  public Source addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

  public Source addImagesItem(String imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

}