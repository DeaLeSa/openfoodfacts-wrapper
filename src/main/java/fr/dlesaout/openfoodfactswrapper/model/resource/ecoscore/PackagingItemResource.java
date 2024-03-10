package fr.dlesaout.openfoodfactswrapper.model.resource.ecoscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("PackagingItemResource")
@Schema(name = "PackagingItemResource", description = "Resource representing packaging information of the product.")
@Data
@NoArgsConstructor
public class PackagingItemResource {

    @JsonProperty("ecoscore_material_score")
    @Schema(description = "Eco-score of the packaging material.", example = "50")
    private int ecoscoreMaterialScore;

    @JsonProperty("ecoscore_shape_ratio")
    @Schema(description = "Ratio of the packaging shape's eco-score to the total eco-score.", example = "0.1")
    private double ecoscoreShapeRatio;

    @JsonProperty("material")
    @Schema(description = "Material used for packaging.")
    private String material;

    @JsonProperty("material_shape")
    @Schema(description = "Shape of the packaging material.")
    private String materialShape;

    @JsonProperty("non_recyclable_and_non_biodegradable")
    @Schema(description = "Indicator for whether the packaging is non-recyclable and non-biodegradable.", example = "no")
    private String nonRecyclableAndNonBiodegradable;

    @JsonProperty("number_of_units")
    @Schema(description = "Number of packaging units.")
    private int numberOfUnits;

    @JsonProperty("quantity_per_unit")
    @Schema(description = "Quantity per packaging unit.", example = "1.5 l")
    private String quantityPerUnit;

    @JsonProperty("quantity_per_unit_unit")
    @Schema(description = "Unit of quantity per packaging unit.", example = "l")
    private String quantityPerUnitUnit;

    @JsonProperty("quantity_per_unit_value")
    @Schema(description = "Numeric value of quantity per packaging unit.", example = "1.5")
    private double quantityPerUnitValue;

    @JsonProperty("recycling")
    @Schema(description = "Recycling information for the packaging.")
    private String recycling;

    @JsonProperty("shape")
    @Schema(description = "Shape of the packaging.")
    private String shape;

    @JsonProperty("weight_measured")
    @Schema(description = "Measured weight of the packaging.", example = "20.24")
    private double weightMeasured;

}
