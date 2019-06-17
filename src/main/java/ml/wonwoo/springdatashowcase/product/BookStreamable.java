package ml.wonwoo.springdatashowcase.product;


import java.util.Iterator;
import javax.money.MonetaryAmount;
import lombok.RequiredArgsConstructor;
import ml.wonwoo.springdatashowcase.support.Currencies;
import org.springframework.data.util.Streamable;

@RequiredArgsConstructor(staticName = "of")
public class BookStreamable implements Streamable<Book> {

    private final Streamable<Book> books;

    public MonetaryAmount getTotal() {
        return books
            .map(Book::getPrice)
            .get()
            .reduce(Currencies.ZERO, MonetaryAmount::add);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
