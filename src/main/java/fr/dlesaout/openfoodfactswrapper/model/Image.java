package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("Image")
@Schema(description = "Represents the various images associated with a product, allowing for dynamic keys.")
@Data
@NoArgsConstructor
public class Image {

    private Map<String, Object> other = new LinkedHashMap<>();

    @JsonAnySetter
    public void addImageDetail(String key, Object value) {
        this.other.put(key, value);
    }

    public Map<String, Object> getImages() {
        return other;
    }
}
