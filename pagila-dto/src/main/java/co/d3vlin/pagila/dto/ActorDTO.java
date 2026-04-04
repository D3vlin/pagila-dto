package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(
        name = "Actor",
        description = "Actor Schema",
        title = "Actor Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActorDTO {
    @Schema(
            name = "id",
            description = "Actor ID",
            title = "Actor ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "firstName",
            description = "Actor First Name",
            title = "Actor First Name"
    )
    private String firstName;

    @Schema(
            name = "lastName",
            description = "Actor Last Name",
            title = "Actor Last Name"
    )
    private String lastName;

    @Schema(
            name = "lastUpdate",
            description = "Actor Last Update",
            title = "Actor Last Update"
    )
    private String lastUpdate;
}
