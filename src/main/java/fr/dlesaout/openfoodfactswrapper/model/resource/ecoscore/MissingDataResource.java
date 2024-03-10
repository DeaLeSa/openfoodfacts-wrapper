package fr.dlesaout.openfoodfactswrapper.model.resource.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("MissingDataResource")
@Schema(name = "MissingDataResource", description = "Resource representing missing data related to the product.")
public class MissingDataResource {

    @JsonProperty("labels")
    @Schema(description = "Number of missing labels associated with the product.", example = "1")
    private int labels;

    @JsonProperty("packagings")
    @Schema(description = "Number of missing packagings associated with the product.", example = "1")
    private int packagings;

}