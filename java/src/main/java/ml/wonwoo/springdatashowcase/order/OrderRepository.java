package ml.wonwoo.springdatashowcase.order;

import io.vavr.control.Try;
import ml.wonwoo.springdatashowcase.support.Identifier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Identifier> {

    Try<Order> findByOrderStatus(OrderStatus orderStatus);

}
