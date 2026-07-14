package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Rental",
        description = "Rental Schema",
        title = "Rental Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RentalDTO {
    @Schema(
            name = "id",
            description = "Rental ID",
            title = "Rental ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "rentalDate",
            description = "Rental Rental Date",
            title = "Rental Rental Date"
    )
    private LocalDateTime rentalDate;

    @Schema(
            name = "inventory",
            description = "Rental Inventory",
            title = "Rental Inventory"
    )
    private InventoryDTO inventory;

    @Schema(
            name = "customer",
            description = "Rental Customer",
            title = "Rental Customer"
    )
    private CustomerDTO customer;

    @Schema(
            name = "returnDate",
            description = "Rental Return Date",
            title = "Rental Return Date"
    )
    private LocalDateTime returnDate;

    @Schema(
            name = "staff",
            description = "Rental Staff",
            title = "Rental Staff"
    )
    private StaffDTO staff;

    @Schema(
            name = "lastUpdate",
            description = "Rental Last Update",
            title = "Rental Last Update"
    )
    private LocalDateTime lastUpdate;
}
