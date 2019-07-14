package ml.wonwoo.springdatashowcase.order;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestConstructor;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class OrderRepositoryTests {

    private final OrderRepository orderRepository;

    private OrderRepositoryTests(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Test
    void ordered() {
        Order order = orderRepository.save(new Order());
        assertThat(order.getOrderStatus()).isEqualTo(OrderStatus.NONE);
    }
}