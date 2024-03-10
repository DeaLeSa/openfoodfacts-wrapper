package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ThreatenedSpecyResource")
@Schema(name = "ThreatenedSpecyResource", description = "Information about an ingredient's impact on threatened species.")
@Data
@NoArgsConstructor
public class ThreatenedSpecy {

    @JsonProperty("ingredient")
    @Schema(description = "The ingredient related to threatened species.")
    private String ingredient;

    @JsonProperty("value")
    @Schema(description = "Value representing the impact of the ingredient on threatened species.", example = "-10")
    private int value;

}
