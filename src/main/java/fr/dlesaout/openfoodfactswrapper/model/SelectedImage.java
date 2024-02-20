package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("SelectedImage")
@Schema(description = "Represents selected images in various sizes for a product.")
@Data
@NoArgsConstructor
public class SelectedImage {

    @JsonProperty("display")
    @Schema(description = "Display size image of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private SelectedImageItem display;

    @JsonProperty("small")
    @Schema(description = "Small size image of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private SelectedImageItem small;

    @JsonProperty("thumb")
    @Schema(description = "Thumbnail size image of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private SelectedImageItem thumb;

}