package ml.wonwoo.springdatashowcase.product;

import static ml.wonwoo.springdatashowcase.support.Currencies.USD;

import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import ml.wonwoo.springdatashowcase.product.Book.BookType;
import org.javamoney.moneta.Money;
import org.springframework.data.web.JsonPath;
import org.springframework.data.web.ProjectedPayload;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    @PostMapping("/books")
    public void books(@Valid @RequestBody Books payload) {

    }

    @ProjectedPayload
    interface Books {

        @NotEmpty
        @JsonPath("$..name")
        String getName();

        @NotEmpty
        @JsonPath("$..image")
        String getImage();

        @NotEmpty
        @JsonPath("$..author")
        String getAuthor();

        @NotNull
        @JsonPath("$..price")
        BigDecimal getPrice();

        @NotNull
        @JsonPath("$..type")
        BookType getType();

        default Book toBook() {
            return new Book(getName(), getImage(), getAuthor(), Money.of(getPrice(), USD), getType());
        }

    }
}
