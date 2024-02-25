package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("Additive")
@Schema(description = "Additive")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Additive {

    @Schema(description = "The number of additives", example = "0")
    @JsonProperty("additivesN")
    private int additivesN;

    @Schema(description = "Old count of additives", example = "4")
    @JsonProperty("additivesOldN")
    private int additivesOldN;

    @Schema(description = "Original tags for additives")
    @JsonProperty("additivesOriginalTags")
    private String[] additivesOriginalTags;

    @Schema(description = "Old tags for additives")
    @JsonProperty("additivesOldTags")
    private String[] additivesOldTags;

    @Schema(description = "Previous original tags for additives")
    @JsonProperty("additivesPrevOriginalTags")
    private String[] additivesPrevOriginalTags;

    @Schema(description = "Debug tags for additives")
    @JsonProperty("additivesDebugTags")
    private String[] additivesDebugTags;

    @Schema(description = "Current tags for additives")
    @JsonProperty("additivesTags")
    private String[] additivesTags;

}
