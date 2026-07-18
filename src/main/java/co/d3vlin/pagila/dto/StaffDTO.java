package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "{validation.staff.firstName.required}")
    @Size(min = 1, message = "{validation.staff.firstName.length}")
    private String firstName;

    @Schema(
            name = "lastName",
            description = "Staff Last Name",
            title = "Staff Last Name"
    )
    @NotBlank(message = "{validation.staff.lastName.required}")
    @Size(min = 1, message = "{validation.staff.lastName.length}")
    private String lastName;

    @Schema(
            name = "address",
            description = "Staff Address",
            title = "Staff Address"
    )
    @NotNull(message = "{validation.staff.address.required}")
    private AddressDTO address;

    @Schema(
            name = "email",
            description = "Staff Email",
            title = "Staff Email"
    )
    private String email;

    @Schema(
            name = "store",
            description = "Staff Store Reference",
            title = "Staff Store Reference"
    )
    @NotNull(message = "{validation.staff.store.required}")
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
    @NotBlank(message = "{validation.staff.username.required}")
    @Size(min = 1, message = "{validation.staff.username.length}")
    private String username;

    @Schema(
            name = "password",
            description = "Staff Password",
            title = "Staff Password"
    )
    @NotBlank(message = "{validation.staff.password.required}")
    @Size(min = 1, message = "{validation.staff.password.length}")
    private String password;

    @Schema(
            name = "lastUpdate",
            description = "Staff Last Update",
            title = "Staff Last Update"
    )
    @NotBlank(message = "{validation.staff.lastUpdate.required}")
    private LocalDateTime lastUpdate;

    @Schema(
            name = "picture",
            description = "Staff Picture",
            title = "Staff Picture"
    )
    private byte[] picture;
}
