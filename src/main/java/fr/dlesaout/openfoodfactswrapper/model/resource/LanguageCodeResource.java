package fr.dlesaout.openfoodfactswrapper.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("LanguageCodeResource")
@Schema(description = "Represents language codes for different languages.")
@Data
@NoArgsConstructor
public class LanguageCodeResource {

    @Schema(description = "Language code for English.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("en")
    private String en;

    @Schema(description = "Language code for French.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fr")
    private String fr;

    @Schema(description = "Language code for Polish.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pl")
    private String pl;

}
