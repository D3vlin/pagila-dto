package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "{validation.language.name.required}")
    @Size(min = 1, max = 20, message = "{validation.language.name.length}")
    private String name;

    @Schema(
            name = "lastUpdate",
            description = "Language Last Update",
            title = "Language Last Update"
    )
    @NotBlank(message = "{validation.language.lastUpdate.required}")
    private LocalDateTime lastUpdate;
}
