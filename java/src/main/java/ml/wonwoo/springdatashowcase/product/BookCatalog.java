package ml.wonwoo.springdatashowcase.product;

public interface BookCatalog extends Catalog<Book> {

    Books findByAuthor(String author);
}
