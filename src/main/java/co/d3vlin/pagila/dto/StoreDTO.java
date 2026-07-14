package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Store",
        description = "Store Schema",
        title = "Store Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoreDTO {
    @Schema(
            name = "id",
            description = "Store ID",
            title = "Store ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "managerStaff",
            description = "Store Manager Staff",
            title = "Store Manager Staff"
    )
    private StaffDTO managerStaff;

    @Schema(
            name = "address",
            description = "Store Address",
            title = "Store Address"
    )
    private AddressDTO address;

    @Schema(
            name = "lastUpdate",
            description = "Store Last Update",
            title = "Store Last Update"
    )
    private LocalDateTime lastUpdate;
}
