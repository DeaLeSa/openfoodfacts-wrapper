package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("PackagingResource")
@Schema(name = "PackagingResource", description = "Resource representing packaging information of the product.")
public class Packaging {

    @JsonProperty("nonRecyclableAndNonBiodegradableMaterials")
    @Schema(description = "Count of non-recyclable and non-biodegradable materials used in packaging.", example = "2")
    private int nonRecyclableAndNonBiodegradableMaterials;

    @JsonProperty("packagings")
    @Schema(description = "List of packaging items used in the product.")
    private List<PackagingItem> packagings;

    @JsonProperty("packagingScore")
    @Schema(description = "Overall eco-score for the packaging of the product.")
    private int packagingScore;

    @JsonProperty("packagingValue")
    @Schema(description = "Value indicating the environmental impact of the packaging.")
    private int packagingValue;

    @JsonProperty("packagingWarning")
    @Schema(description = "Warning related to the packaging of the product.")
    private String packagingWarning;

}
