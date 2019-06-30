package ml.wonwoo.springdatashowcase.order;

import lombok.extern.slf4j.Slf4j;
import ml.wonwoo.springdatashowcase.event.Event;
import ml.wonwoo.springdatashowcase.event.EventRepository;
import ml.wonwoo.springdatashowcase.order.Order.OrderPaid;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
@Slf4j
public class OrderEventListener {

    private final EventRepository eventRepository;

    public OrderEventListener(EventRepository eventRepository) {

        Assert.notNull(eventRepository, "eventRepository must not be null!");

        this.eventRepository = eventRepository;

    }

    @EventListener
    public void orderPaid(OrderPaid orderPaid) {

        Order order = orderPaid.getOrder();

        eventRepository.save(new Event(order));

        log.info("Publisher event {}", order);

    }
}
