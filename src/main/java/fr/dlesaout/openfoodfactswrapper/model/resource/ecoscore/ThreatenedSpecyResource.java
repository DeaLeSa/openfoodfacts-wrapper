package fr.dlesaout.openfoodfactswrapper.model.resource.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ThreatenedSpecyResource")
@Schema(name = "ThreatenedSpecyResource", description = "Information about an ingredient's impact on threatened species.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThreatenedSpecyResource {

    @JsonProperty("ingredient")
    @Schema(description = "The ingredient related to threatened species.")
    private String ingredient;

}
