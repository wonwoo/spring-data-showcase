package ml.wonwoo.springdatashowcase.order;

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
    }
}
