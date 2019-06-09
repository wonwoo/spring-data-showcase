package ml.wonwoo.springdatashowcase.product;

import javax.money.MonetaryAmount;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ml.wonwoo.springdatashowcase.support.Identifier;

@MappedSuperclass
public class Product {

    @EmbeddedId
    @AttributeOverride(name = "id", column = @Column(name = "PRODUCT_ID"))
    private Identifier productIdentifier = new Identifier();

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private MonetaryAmount price;

    Product() {}

    public Product(String name, MonetaryAmount price) {
        this.name = name;
        this.price = price;
    }

}
