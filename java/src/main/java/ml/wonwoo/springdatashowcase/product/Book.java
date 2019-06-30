package ml.wonwoo.springdatashowcase.product;

import javax.money.MonetaryAmount;
import javax.persistence.Entity;

@Entity
public class Book extends Product {

    public enum BookType {
        SOFTWARE,
        SCIENCE,
        FANTASY,
    }

    private String image;
    private String author;
    private BookType type;

    public Book(String name, String image, String author, MonetaryAmount price, BookType type) {
        super(name, price);
        this.image = image;
        this.author = author;
        this.type = type;
    }

    private Book() {

    }

    public String getImage() {
        return image;
    }

    public BookType getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }
}
