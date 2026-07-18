package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Schema(
        name = "Customer",
        description = "Customer Schema",
        title = "Customer Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO {
    @Schema(
            name = "id",
            description = "Customer ID",
            title = "Customer ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "store",
            description = "Customer Store",
            title = "Customer Store"
    )
    @NotNull(message = "{validation.customer.store.required}")
    private StoreDTO store;

    @Schema(
            name = "firstName",
            description = "Customer First Name",
            title = "Customer First Name"
    )
    @NotBlank(message = "{validation.customer.firstName.required}")
    @Size(min = 1, message = "{validation.customer.firstName.length}")
    private String firstName;

    @Schema(
            name = "lastName",
            description = "Customer Last Name",
            title = "Customer Last Name"
    )
    @NotBlank(message = "{validation.customer.lastName.required}")
    @Size(min = 1, message = "{validation.customer.lastName.length}")
    private String lastName;

    @Schema(
            name = "email",
            description = "Customer Last Name",
            title = "Customer Last Name"
    )
    private String email;

    @Schema(
            name = "address",
            description = "Customer Address",
            title = "Customer Address"
    )
    @NotNull(message = "{validation.customer.address.required}")
    private AddressDTO address;

    @Schema(
            name = "activeBool",
            description = "Customer Active Bool",
            title = "Customer Active Bool"
    )
    private Boolean activeBool;

    @Schema(
            name = "createDate",
            description = "Customer Create Date",
            title = "Customer Create Date"
    )
    @NotBlank(message = "{validation.customer.createDate.required}")
    private LocalDate createDate;

    @Schema(
            name = "lastUpdate",
            description = "Customer Last Update",
            title = "Customer Last Update"
    )
    @NotBlank(message = "{validation.customer.lastUpdate.required}")
    private LocalDateTime lastUpdate;

    @Schema(
            name = "active",
            description = "Customer Active",
            title = "Customer Active"
    )
    private Integer active;
}
