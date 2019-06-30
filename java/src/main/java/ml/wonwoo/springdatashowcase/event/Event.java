package ml.wonwoo.springdatashowcase.event;

import lombok.Value;
import ml.wonwoo.springdatashowcase.order.Order;
import ml.wonwoo.springdatashowcase.order.OrderStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@Value
public class Event {

    @Id
    String id;

    String orderId;

    OrderStatus orderStatus;

    public Event(Order order) {
        this(UUID.randomUUID().toString(), order.getId(), order.getOrderStatus());
    }

    @PersistenceConstructor
    private Event(String id, String orderId, OrderStatus orderStatus) {

        this.id = id;
        this.orderId = orderId;
        this.orderStatus = orderStatus;

    }
}
