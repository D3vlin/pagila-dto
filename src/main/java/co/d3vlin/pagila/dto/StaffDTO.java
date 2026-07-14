package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Staff",
        description = "Staff Schema",
        title = "Staff Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StaffDTO {
    @Schema(
            name = "id",
            description = "Staff ID",
            title = "Staff ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "firstName",
            description = "Staff First Name",
            title = "Staff First Name"
    )
    private String firstName;

    @Schema(
            name = "lastName",
            description = "Staff Last Name",
            title = "Staff Last Name"
    )
    private String lastName;

    @Schema(
            name = "address",
            description = "Staff Address",
            title = "Staff Address"
    )
    private AddressDTO address;

    @Schema(
            name = "email",
            description = "Staff Email",
            title = "Staff Email"
    )
    private String email;

    @Schema(
            name = "store",
            description = "Staff Store",
            title = "Staff Store"
    )
    private StoreDTO store;

    @Schema(
            name = "active",
            description = "Staff Active",
            title = "Staff Active"
    )
    private Boolean active;

    @Schema(
            name = "username",
            description = "Staff Username",
            title = "Staff Username"
    )
    private String username;

    @Schema(
            name = "password",
            description = "Staff Password",
            title = "Staff Password"
    )
    private String password;

    @Schema(
            name = "lastUpdate",
            description = "Staff Last Update",
            title = "Staff Last Update"
    )
    private LocalDateTime lastUpdate;
}
