package ml.wonwoo.springdatashowcase.product;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import ml.wonwoo.springdatashowcase.data.InitializerData;
import ml.wonwoo.springdatashowcase.product.Book.BookType;
import ml.wonwoo.springdatashowcase.product.Disc.DiscType;
import org.javamoney.moneta.Money;
import org.springframework.stereotype.Component;

@Component
public class ProductInitializerData implements InitializerData {

    private final CurrencyUnit USD = Monetary.getCurrency("USD");

    private final BookCatalog bookCatalog;
    private final Catalog<Disc> discCatalog;

    public ProductInitializerData(BookCatalog bookCatalog, Catalog<Disc> discCatalog) {
        this.bookCatalog = bookCatalog;
        this.discCatalog = discCatalog;
    }

    @Override
    public void initialize() {

        bookCatalog.save(new Book("Effective Java", "http://localhost:8080",
            "Joshua Bloch", Money.of(3.99, USD), BookType.SOFTWARE));

        bookCatalog.save(new Book("Back to the Future", "http://localhost:8080",
            "Michael Klastorin", Money.of(6.99, USD), BookType.FANTASY));

        discCatalog.save(new Disc("Back to the Future", "http://localhost:8080",
            "Sci-Fi", Money.of(5.99, USD), DiscType.BLURAY));
    }
}
