package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonTypeName("PaginationInfo")
@Schema(name = "PaginationInfo", description = "Represents pagination details for a list of products.")
@Data
@NoArgsConstructor
public class PaginationInfo {

    @JsonProperty("count")
    @Schema(description = "Total number of items available.")
    private int count;

    @JsonProperty("page")
    @Schema(description = "Current page number.")
    private int page;

    @JsonProperty("pageCount")
    @Schema(description = "Number of items per page.")
    private int pageCount;

    @JsonProperty("pageSize")
    @Schema(description = "Maximum number of items allowed per page.")
    private int pageSize;

}