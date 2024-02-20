package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@JsonTypeName("Error")
public class Error {
    private Integer code;
    private String message;

    public Error() {
    }

    public Error(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Error code(Integer code) {
        this.code = code;
        return this;
    }

    @Schema(
            name = "code",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("code")
    public @NotNull Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    @Schema(
            name = "message",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("message")
    public @NotNull String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Error error = (Error)o;
            return Objects.equals(this.code, error.code) && Objects.equals(this.message, error.message);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.code, this.message});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        sb.append("    code: ").append(this.toIndentedString(this.code)).append("\n");
        sb.append("    message: ").append(this.toIndentedString(this.message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
