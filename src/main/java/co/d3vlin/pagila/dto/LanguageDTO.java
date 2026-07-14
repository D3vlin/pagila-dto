package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Language",
        description = "Language Schema",
        title = "Language Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LanguageDTO {
    @Schema(
            name = "id",
            description = "Language ID",
            title = "Language ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "name",
            description = "Language Name",
            title = "Language Name"
    )
    private String name;

    @Schema(
            name = "lastUpdate",
            description = "Language Last Update",
            title = "Language Last Update"
    )
    private LocalDateTime lastUpdate;
}
