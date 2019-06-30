package ml.wonwoo.springdatashowcase.product;

import javax.money.MonetaryAmount;
import javax.persistence.Entity;

@Entity
public class Disc extends Product {

    public enum DiscType {
        BLURAY, DVD;
    }

    private String image;
    private String genre;
    private DiscType type;

    public Disc(String name, String image, String genre, MonetaryAmount price, DiscType type) {
        super(name, price);
        this.image = image;
        this.genre = genre;
        this.type = type;
    }

    private Disc() {

    }

    public String getImage() {
        return image;
    }

    public DiscType getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }
}
