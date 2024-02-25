package fr.dlesaout.openfoodfactswrapper.model.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeName("PaginationInfoResource")
@Schema(name = "PaginationInfoResource", description = "Represents pagination details for a list of products.")
@Data
@NoArgsConstructor
public class PaginationInfoResource {

    @JsonProperty("count")
    @Schema(description = "Total number of items available.")
    private int count;

    @JsonProperty("page")
    @Schema(description = "Current page number.")
    private int page;

    @JsonProperty("page_count")
    @Schema(description = "Number of items per page.")
    private int pageCount;

    @JsonProperty("page_size")
    @Schema(description = "Maximum number of items allowed per page.")
    private int pageSize;

}
