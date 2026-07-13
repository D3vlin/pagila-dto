package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.Year;
import java.util.List;

@Data
@Schema(
        name = "Film",
        description = "Film Schema",
        title = "Film Schema"
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilmDTO {
    @Schema(
            name = "id",
            description = "Film ID",
            title = "Film ID",
            format = "int32"
    )
    private Integer id;

    @Schema(
            name = "title",
            description = "Film Title",
            title = "Film Title"
    )
    private String title;

    @Schema(
            name = "description",
            description = "Film Description",
            title = "Film Description"
    )
    private String description;

    @Schema(
            name = "releaseYear",
            description = "Film Release Year",
            title = "Film Release Year"
    )
    private Year releaseYear;

    @Schema(
            name = "language",
            description = "Film Language",
            title = "Film Language"
    )
    private LanguageDTO language;

    @Schema(
            name = "originalLanguage",
            description = "Film Original Language",
            title = "Film Original Language"
    )
    private LanguageDTO originalLanguage;

    @Schema(
            name = "rentalDuration",
            description = "Film Rental Duration",
            title = "Film Rental Duration"
    )
    private Short rentalDuration;

    @Schema(
            name = "rentalRate",
            description = "Film Rental Rate",
            title = "Film Rental Rate"
    )
    private BigDecimal rentalRate;

    @Schema(
            name = "length",
            description = "Film Length",
            title = "Film Length"
    )
    private Short length;

    @Schema(
            name = "replacementCost",
            description = "Film Replacement Cost",
            title = "Film Replacement Cost"
    )
    private BigDecimal replacementCost;

    @Schema(
            name = "rating",
            description = "Film Rating",
            title = "Film Rating"
    )
    private EMpaaRating rating;

    @Schema(
            name = "lastUpdate",
            description = "Film Last Update",
            title = "Film Last Update"
    )
    private OffsetDateTime lastUpdate;

    @Schema(
            name = "specialFeatures",
            description = "Film Special Features",
            title = "Film Special Features"
    )
    private List<String> specialFeatures;

    @Schema(
            name = "fullText",
            description = "Film Description",
            title = "Film Description"
    )
    private String fullText;
}
