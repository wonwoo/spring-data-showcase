package ml.wonwoo.springdatashowcase.order;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import ml.wonwoo.springdatashowcase.support.Identifier;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
@Table(name = "ORDERS")
public class Order extends AbstractAggregateRoot<Order> {

    @EmbeddedId
    @AttributeOverride(name = "id", column = @Column(name = "ORDER_ID"))
    private Identifier identifier = new Identifier();

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private OrderStatus orderStatus = OrderStatus.NONE;

    Order() {

    }

    public String getId() {
        return identifier.getIdentifier();
    }

    public void orderPaid() {

        this.orderStatus = OrderStatus.PAID;

        registerEvent(OrderPaid.of(this));

    }

    @Value(staticConstructor = "of")
    public static class OrderPaid {

        Order order;

    }


}
