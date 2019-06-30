package ml.wonwoo.springdatashowcase.order;

import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import ml.wonwoo.springdatashowcase.data.InitializerData;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderInitializerData implements InitializerData {

    private final OrderRepository orderRepository;

    @Override
    public void initialize() {

        Order order = orderRepository.save(new Order());

        order.orderPaid();

        orderRepository.save(order);

        Try<Order> orderd = orderRepository.findByOrderStatus(OrderStatus.PAID);
        //

    }
}
