package ml.wonwoo.springdatashowcase.order;

import lombok.extern.slf4j.Slf4j;
import ml.wonwoo.springdatashowcase.order.Order.OrderPaid;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderEventListener {

    @EventListener
    public void orderPaid(OrderPaid orderPaid) {
        Order order = orderPaid.getOrder();
        log.info("Publisher event {}", order);
    }
}
