package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Country",
        description = "Country Schema",
        title = "Country Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDTO {
    @Schema(
            name = "id",
            description = "Country ID",
            title = "Country ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "country",
            description = "Country",
            title = "Country"
    )
    @NotBlank(message = "{validation.country.country.required}")
    @Size(min = 1, message = "{validation.country.country.length}")
    private String country;

    @Schema(
            name = "lastUpdate",
            description = "Country Last Update",
            title = "Country Last Update"
    )
    @NotBlank(message = "{validation.country.lastUpdate.required}")
    private LocalDateTime lastUpdate;
}
