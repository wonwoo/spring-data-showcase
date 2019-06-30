package ml.wonwoo.springdatashowcase.product;


import lombok.RequiredArgsConstructor;
import ml.wonwoo.springdatashowcase.support.Currencies;
import org.springframework.data.util.Streamable;

import javax.money.MonetaryAmount;
import java.util.Iterator;

@RequiredArgsConstructor(staticName = "of")
public class Books implements Streamable<Book> {

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
