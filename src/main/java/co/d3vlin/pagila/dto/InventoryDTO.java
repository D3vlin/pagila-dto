package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
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
    private FilmDTO film;

    @Schema(
            name = "store",
            description = "Inventory Store",
            title = "Inventory Store"
    )
    private StoreDTO store;

    @Schema(
            name = "lastUpdate",
            description = "Inventory Last Update",
            title = "Inventory Last Update"
    )
    private LocalDateTime lastUpdate;
}
