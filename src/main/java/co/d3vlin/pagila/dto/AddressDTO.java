package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
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
    private String district;

    @Schema(
            name = "city",
            description = "Address City",
            title = "Address City"
    )
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
    private String phone;

    @Schema(
            name = "lastUpdate",
            description = "Address Last Update",
            title = "Address Last Update"
    )
    private LocalDateTime lastUpdate;
}
