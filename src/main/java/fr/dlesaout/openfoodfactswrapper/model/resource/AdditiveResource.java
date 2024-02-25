package fr.dlesaout.openfoodfactswrapper.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("AdditiveResource")
@Schema(description = "AdditiveResource")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditiveResource {

    @Schema(description = "The number of additives", example = "0")
    @JsonProperty("additives_n")
    private int additivesN;

    @Schema(description = "Old count of additives", example = "4")
    @JsonProperty("additives_old_n")
    private int additivesOldN;

    @Schema(description = "Original tags for additives")
    @JsonProperty("additives_original_tags")
    private String[] additivesOriginalTags;

    @Schema(description = "Old tags for additives")
    @JsonProperty("additives_old_tags")
    private String[] additivesOldTags;

    @Schema(description = "Previous original tags for additives")
    @JsonProperty("additives_prev_original_tags")
    private String[] additivesPrevOriginalTags;

    @Schema(description = "Debug tags for additives")
    @JsonProperty("additives_debug_tags")
    private String[] additivesDebugTags;

    @Schema(description = "Current tags for additives")
    @JsonProperty("additives_tags")
    private String[] additivesTags;

}
