package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("UncharacterizedIngredientResource")
@Schema(name = "UncharacterizedIngredientResource", description = "Information about uncharacterized ingredient in the product.")
@Data
@NoArgsConstructor
public class UncharacterizedIngredient {

    @JsonProperty("impact")
    @Schema(description = "List of uncharacterized ingredients with their environmental impact.")
    private List<String> impact;

    @JsonProperty("nutrition")
    @Schema(description = "List of uncharacterized ingredients with their nutritional value.")
    private List<String> nutrition;

}
