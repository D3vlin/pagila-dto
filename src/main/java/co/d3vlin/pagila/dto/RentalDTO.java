package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank(message = "{validation.rental.rentalDate.required}")
    private LocalDateTime rentalDate;

    @Schema(
            name = "inventory",
            description = "Rental Inventory",
            title = "Rental Inventory"
    )
    @NotNull(message = "{validation.rental.inventory.required}")
    private InventoryDTO inventory;

    @Schema(
            name = "customer",
            description = "Rental Customer",
            title = "Rental Customer"
    )
    @NotNull(message = "{validation.rental.customer.required}")
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
    @NotNull(message = "{validation.rental.staff.required}")
    private StaffDTO staff;

    @Schema(
            name = "lastUpdate",
            description = "Rental Last Update",
            title = "Rental Last Update"
    )
    @NotBlank(message = "{validation.rental.lastUpdate.required}")
    private LocalDateTime lastUpdate;
}
