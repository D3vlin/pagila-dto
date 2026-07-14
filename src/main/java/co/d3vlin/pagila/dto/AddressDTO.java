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
        name = "Address",
        description = "Address Schema",
        title = "Address Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {
    @Schema(
            name = "id",
            description = "Address ID",
            title = "Address ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "address",
            description = "Address Principal",
            title = "Address Principal"
    )
    @NotBlank(message = "{validation.address.address.required}")
    @Size(min = 1, message = "{validation.address.address.length}")
    private String address;

    @Schema(
            name = "address2",
            description = "Address Second",
            title = "Address Second"
    )
    private String address2;

    @Schema(
            name = "district",
            description = "Address District",
            title = "Address District"
    )
    @NotBlank(message = "{validation.address.district.required}")
    @Size(min = 1, message = "{validation.address.district.length}")
    private String district;

    @Schema(
            name = "city",
            description = "Address City",
            title = "Address City"
    )
    @NotNull(message = "{validation.address.city.required}")
    private CityDTO city;

    @Schema(
            name = "postalCode",
            description = "Address Postal Code",
            title = "Address Postal Code"
    )
    private String postalCode;

    @Schema(
            name = "phone",
            description = "Address Phone",
            title = "Address Phone"
    )
    @NotBlank(message = "{validation.address.phone.required}")
    @Size(min = 1, message = "{validation.address.phone.length}")
    private String phone;

    @Schema(
            name = "lastUpdate",
            description = "Address Last Update",
            title = "Address Last Update"
    )
    @NotBlank(message = "{validation.address.lastUpdate.required}")
    private LocalDateTime lastUpdate;
}
