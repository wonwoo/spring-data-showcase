package ml.wonwoo.springdatashowcase.product;

import ml.wonwoo.springdatashowcase.data.InitializerData;
import ml.wonwoo.springdatashowcase.product.Book.BookType;
import ml.wonwoo.springdatashowcase.product.Disc.DiscType;
import org.javamoney.moneta.Money;
import org.springframework.stereotype.Component;

import javax.money.MonetaryAmount;

import static ml.wonwoo.springdatashowcase.support.Currencies.USD;

@Component
public class ProductInitializerData implements InitializerData {

    private final BookCatalog bookCatalog;
    private final DiscCatalog discCatalog;

    public ProductInitializerData(BookCatalog bookCatalog, DiscCatalog discCatalog) {
        this.bookCatalog = bookCatalog;
        this.discCatalog = discCatalog;
    }

    @Override
    public void initialize() {

        bookCatalog.save(new Book("Effective Java", "http://localhost:8080",
            "Joshua Bloch", Money.of(3.99, USD), BookType.SOFTWARE));

        bookCatalog.save(new Book("Effective Java", "http://localhost:8080",
            "Joshua Bloch", Money.of(8.99, USD), BookType.SOFTWARE));

        bookCatalog.save(new Book("Back to the Future", "http://localhost:8080",
            "Michael Klastorin", Money.of(6.99, USD), BookType.FANTASY));

        discCatalog.save(new Disc("Back to the Future", "http://localhost:8080",
            "Sci-Fi", Money.of(5.99, USD), DiscType.BLURAY));

        Books authors = bookCatalog.findByAuthor("Joshua Bloch");
        MonetaryAmount total = authors.getTotal();
        System.out.println(total);

    }
}
