package ml.wonwoo.springdatashowcase.product;

public interface BookCatalog extends Catalog<Book> {

    BookStreamable findByAuthor(String author);
}
