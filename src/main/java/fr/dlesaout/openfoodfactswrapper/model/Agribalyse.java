package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@JsonIgnoreProperties(ignoreUnknown = true)
@Accessors(chain = true)
@JsonTypeName("Agribalyse")
@Schema(description = "Contains detailed environmental impact data of a product according to the Agribalyse database.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agribalyse {

    @JsonProperty("agribalyseProxyFoodCode")
    @Schema(description = "Unique identifier for the food item in the Agribalyse database.")
    private String agribalyseProxyFoodCode;

    @JsonProperty("co2Agriculture")
    @Schema(description = "CO2 emissions from agricultural production.")
    private double co2Agriculture;

    @JsonProperty("co2Consumption")
    @Schema(description = "CO2 emissions from consumption phase.")
    private double co2Consumption;

    @JsonProperty("co2Distribution")
    @Schema(description = "CO2 emissions from distribution.")
    private double co2Distribution;

    @JsonProperty("co2Packaging")
    @Schema(description = "CO2 emissions from packaging.")
    private double co2Packaging;

    @JsonProperty("co2Processing")
    @Schema(description = "CO2 emissions from processing.")
    private double co2Processing;

    @JsonProperty("co2Total")
    @Schema(description = "Total CO2 emissions for the product.")
    private double co2Total;

    @JsonProperty("co2Transportation")
    @Schema(description = "CO2 emissions from transportation.")
    private double co2Transportation;

    @JsonProperty("code")
    @Schema(description = "Alternative unique identifier for the product.")
    private String code;

    @JsonProperty("dqr")
    @Schema(description = "Data Quality Rating indicating the reliability of the data.")
    private String dqr;

    @JsonProperty("efAgriculture")
    @Schema(description = "Environmental footprint related to agriculture.")
    private double efAgriculture;

    @JsonProperty("efConsumption")
    @Schema(description = "Environmental footprint related to consumption.")
    private double efConsumption;

    @JsonProperty("efDistribution")
    @Schema(description = "Environmental footprint related to distribution.")
    private double efDistribution;

    @JsonProperty("efPackaging")
    @Schema(description = "Environmental footprint related to packaging.")
    private double efPackaging;

    @JsonProperty("efProcessing")
    @Schema(description = "Environmental footprint related to processing.")
    private double efProcessing;

    @JsonProperty("efTotal")
    @Schema(description = "Total environmental footprint for the product.")
    private double efTotal;

    @JsonProperty("efTransportation")
    @Schema(description = "Environmental footprint related to transportation.")
    private double efTransportation;

    @JsonProperty("isBeverage")
    @Schema(description = "Indicates whether the product is a beverage (0 = no, 1 = yes).")
    private int isBeverage;

    @JsonProperty("nameEn")
    @Schema(description = "Name of the product in English.")
    private String nameEn;

    @JsonProperty("nameFr")
    @Schema(description = "Name of the product in French.")
    private String nameFr;

    @JsonProperty("score")
    @Schema(description = "Environmental impact score of the product.")
    private int score;

    @JsonProperty("version")
    @Schema(description = "Version of the Agribalyse database used.")
    private String version;

}
