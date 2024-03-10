package fr.dlesaout.openfoodfactswrapper.model.ecoscore;

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
public class PackagingItem {

    @JsonProperty("ecoscoreMaterialScore")
    @Schema(description = "Eco-score of the packaging material.", example = "50")
    private int ecoscoreMaterialScore;

    @JsonProperty("ecoscoreShapeRatio")
    @Schema(description = "Ratio of the packaging shape's eco-score to the total eco-score.", example = "0.1")
    private double ecoscoreShapeRatio;

    @JsonProperty("material")
    @Schema(description = "Material used for packaging.")
    private String material;

    @JsonProperty("materialShape")
    @Schema(description = "Shape of the packaging material.")
    private String materialShape;

    @JsonProperty("nonRecyclableAndNonBiodegradable")
    @Schema(description = "Indicator for whether the packaging is non-recyclable and non-biodegradable.", example = "no")
    private String nonRecyclableAndNonBiodegradable;

    @JsonProperty("numberOfUnits")
    @Schema(description = "Number of packaging units.")
    private int numberOfUnits;

    @JsonProperty("quantityPerUnit")
    @Schema(description = "Quantity per packaging unit.", example = "1.5 l")
    private String quantityPerUnit;

    @JsonProperty("quantityPerUnitUnit")
    @Schema(description = "Unit of quantity per packaging unit.", example = "l")
    private String quantityPerUnitUnit;

    @JsonProperty("quantityPerUnitValue")
    @Schema(description = "Numeric value of quantity per packaging unit.", example = "1.5")
    private double quantityPerUnitValue;

    @JsonProperty("recycling")
    @Schema(description = "Recycling information for the packaging.")
    private String recycling;

    @JsonProperty("shape")
    @Schema(description = "Shape of the packaging.")
    private String shape;

    @JsonProperty("weightMeasured")
    @Schema(description = "Measured weight of the packaging.", example = "20.24")
    private double weightMeasured;

}
