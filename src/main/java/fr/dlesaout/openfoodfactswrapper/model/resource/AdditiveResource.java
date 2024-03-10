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

    @JsonProperty("products.additives_n")
    private int additivesN;

    @JsonProperty("products.new_additives_n")
    private int additivesNewN;
    private int additivesOldN;
    private String[] additivesOriginalTags;
    private String[] additivesOldTags;
    private String[] additivesPrevOriginalTags;
    private String[] additivesDebugTags;
    private String[] additivesTags;

}
