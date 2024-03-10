package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ProductionSystemResource")
@Schema(name = "ProductionSystemResource", description = "Information about the production system of the product.")
@Data
@NoArgsConstructor
public class ProductionSystem {

    @JsonProperty("labels")
    @Schema(description = "List of labels associated with the product.")
    private List<String> labels;

    @JsonProperty("value")
    @Schema(description = "Value representing the production system of the product.")
    private int value;

    @JsonProperty("warning")
    @Schema(description = "Warning related to the production system of the product.")
    private String warning;

}
