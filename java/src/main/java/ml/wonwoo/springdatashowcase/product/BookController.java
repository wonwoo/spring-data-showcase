package ml.wonwoo.springdatashowcase.product;

import lombok.RequiredArgsConstructor;
import ml.wonwoo.springdatashowcase.product.Book.BookType;
import org.javamoney.moneta.Money;
import org.springframework.data.web.ProjectedPayload;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import static ml.wonwoo.springdatashowcase.support.Currencies.USD;

@RestController
@RequiredArgsConstructor
public class BookController {

    @PostMapping("/books")
    public void books(@Valid @RequestBody BookPayload payload) {

    }

    @ProjectedPayload
    interface BookPayload {

        @NotEmpty
        String getName();

        @NotEmpty
        String getImage();

        @NotEmpty
        String getAuthor();

        @NotNull
        BigDecimal getPrice();

        @NotNull
        BookType getType();

        default Book toBook() {
            return new Book(getName(), getImage(), getAuthor(), Money.of(getPrice(), USD), getType());
        }

    }
}
