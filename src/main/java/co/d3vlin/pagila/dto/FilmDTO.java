package co.d3vlin.pagila.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    @NotBlank(message = "{validation.film.title.required}")
    @Size(min = 1, message = "{validation.film.title.length}")
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
    @NotNull(message = "{validation.film.language.required}")
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
    @NotBlank(message = "{validation.film.rentalDuration.required}")
    private Short rentalDuration;

    @Schema(
            name = "rentalRate",
            description = "Film Rental Rate",
            title = "Film Rental Rate"
    )
    @NotBlank(message = "{validation.film.rentalRate.required}")
    @Digits(integer = 4, fraction = 2, message = "{validation.film.rentalRate.digits}")
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
    @NotBlank(message = "{validation.film.replacementCost.required}")
    @Digits(integer = 5, fraction = 2, message = "{validation.film.replacementCost.digits}")
    private BigDecimal replacementCost;

    @Schema(
            name = "rating",
            description = "Film Rating",
            title = "Film Rating"
    )
    @Pattern(regexp = "^(G|PG|PG-13|R|NC-17)$", message = "{validation.film.rating.not.allowed}")
    private EMpaaRating rating;

    @Schema(
            name = "lastUpdate",
            description = "Film Last Update",
            title = "Film Last Update"
    )
    @NotBlank(message = "{validation.film.lastUpdate.required}")
    private LocalDateTime lastUpdate;

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
    @NotBlank(message = "{validation.film.fullText.required}")
    @Size(min = 1, message = "{validation.film.fullText.length}")
    private String fullText;
}
