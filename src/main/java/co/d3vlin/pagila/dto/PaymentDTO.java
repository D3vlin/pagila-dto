package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Schema(
        name = "Payment",
        description = "Payment Schema",
        title = "Payment Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentDTO {
    @Schema(
            name = "id",
            description = "Payment ID",
            title = "Payment ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "customer",
            description = "Payment Customer",
            title = "Payment Customer"
    )
    private CustomerDTO customer;

    @Schema(
            name = "staff",
            description = "Payment Staff",
            title = "Payment Staff"
    )
    private StaffDTO staff;

    @Schema(
            name = "rental",
            description = "Payment Rental",
            title = "Payment Rental"
    )
    private RentalDTO rental;

    @Schema(
            name = "amount",
            description = "Payment Amount",
            title = "Payment Amount"
    )
    private BigDecimal amount;

    @Schema(
            name = "paymentDate",
            description = "Payment Payment Date",
            title = "Payment Payment Date"
    )
    private LocalDateTime paymentDate;
}
