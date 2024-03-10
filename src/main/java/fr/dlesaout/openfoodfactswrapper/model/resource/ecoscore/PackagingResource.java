package fr.dlesaout.openfoodfactswrapper.model.resource.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("PackagingResource")
@Schema(name = "PackagingResource", description = "Resource representing packaging information of the product.")
public class PackagingResource {

    @JsonProperty("packagings.non_recyclable_and_non_biodegradable_materials")
    @Schema(description = "Count of non-recyclable and non-biodegradable materials used in packaging.", example = "2")
    private int nonRecyclableAndNonBiodegradableMaterials;

    @JsonProperty("packagings")
    @Schema(description = "List of packaging items used in the product.")
    private List<PackagingItemResource> packagings;

    @JsonProperty("packagings.score")
    @Schema(description = "Overall eco-score for the packaging of the product.")
    private int packagingScore;

    @JsonProperty("packagings.value")
    @Schema(description = "Value indicating the environmental impact of the packaging.")
    private int packagingValue;

    @JsonProperty("packagings.warning")
    @Schema(description = "Warning related to the packaging of the product.")
    private String packagingWarning;

}
