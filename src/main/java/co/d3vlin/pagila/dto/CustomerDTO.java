package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
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
    private StoreDTO store;

    @Schema(
            name = "firstName",
            description = "Customer First Name",
            title = "Customer First Name"
    )
    private String firstName;

    @Schema(
            name = "lastName",
            description = "Customer Last Name",
            title = "Customer Last Name"
    )
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
    private LocalDate createDate;

    @Schema(
            name = "lastUpdate",
            description = "Customer Last Update",
            title = "Customer Last Update"
    )
    private LocalDateTime lastUpdate;

    @Schema(
            name = "active",
            description = "Customer Active",
            title = "Customer Active"
    )
    private Integer active;
}
