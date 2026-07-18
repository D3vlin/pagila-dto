package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "City",
        description = "City Schema",
        title = "City Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CityDTO {
    @Schema(
            name = "id",
            description = "City ID",
            title = "City ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "city",
            description = "City",
            title = "City"
    )
    @NotBlank(message = "{validation.city.city.required}")
    @Size(min = 1, message = "{validation.city.city.length}")
    private String city;

    @Schema(
            name = "country",
            description = "City Country",
            title = "City Country"
    )
    @NotNull(message = "{validation.city.country.required}")
    private CountryDTO country;

    @Schema(
            name = "lastUpdate",
            description = "City Last Update",
            title = "City Last Update"
    )
    @NotBlank(message = "{validation.city.lastUpdate.required}")
    private LocalDateTime lastUpdate;
}
