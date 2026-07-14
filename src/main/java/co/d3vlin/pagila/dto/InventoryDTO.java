package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Inventory",
        description = "Inventory Schema",
        title = "Inventory Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryDTO {
    @Schema(
            name = "id",
            description = "Film ID",
            title = "Film ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "film",
            description = "Inventory Film",
            title = "Inventory Film"
    )
    @NotNull(message = "{validation.inventory.film.required}")
    private FilmDTO film;

    @Schema(
            name = "store",
            description = "Inventory Store",
            title = "Inventory Store"
    )
    @NotNull(message = "{validation.inventory.store.required}")
    private StoreDTO store;

    @Schema(
            name = "lastUpdate",
            description = "Inventory Last Update",
            title = "Inventory Last Update"
    )
    @NotBlank(message = "{validation.inventory.lastUpdate.required}")
    private LocalDateTime lastUpdate;
}
