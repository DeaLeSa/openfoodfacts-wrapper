package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeName("Country")
@Schema(name = "Country")
@Data
@NoArgsConstructor
public class Country {

    @JsonProperty("countries")
    @Schema(description = "Comma-separated list of countries where the product is available.")
    private String countries;

    @JsonProperty("countriesBeforeScanbot")
    @Schema(description = "Countries before being processed by the scanbot.")
    private String countriesBeforeScanbot;

    @JsonProperty("countriesHierarchy")
    @Schema(description = "Hierarchical list of countries in a standardized format.")
    private List<String> countriesHierarchy;

    @JsonProperty("countriesLc")
    @Schema(description = "Language code for the countries information.")
    private String countriesLanguageCode;

    @JsonProperty("countriesTags")
    @Schema(description = "List of countries tags in a standardized format.")
    private List<String> countriesTags;

}