package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Category",
        description = "Category Schema",
        title = "Category Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO {
    @Schema(
            name = "id",
            description = "Category ID",
            title = "Category ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "name",
            description = "Category Name",
            title = "Category Name"
    )
    @NotBlank(message = "{validation.category.name.required}")
    @Size(min = 1, message = "{validation.category.name.length}")
    private String name;

    @Schema(
            name = "lastUpdate",
            description = "Category Last Update",
            title = "Category Last Update"
    )
    @NotBlank(message = "{validation.category.lastUpdate.required}")
    private LocalDateTime lastUpdate;
}
