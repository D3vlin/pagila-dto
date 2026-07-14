package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
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
    private String city;

    @Schema(
            name = "country",
            description = "City Country",
            title = "City Country"
    )
    private CountryDTO country;

    @Schema(
            name = "lastUpdate",
            description = "City Last Update",
            title = "City Last Update"
    )
    private LocalDateTime lastUpdate;
}
