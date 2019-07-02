package ml.wonwoo.springdatashowcase.order

import ml.wonwoo.springdatashowcase.support.Identifier
import org.springframework.data.domain.AbstractAggregateRoot
import javax.persistence.*

@Entity
@Table(name = "ORDERS")
data class Order(

        @EmbeddedId
        @AttributeOverride(name = "id", column = Column(name = "ORDER_ID"))
        private val identifier: Identifier = Identifier(),

        @Enumerated(EnumType.STRING)
        var orderStatus: OrderStatus = OrderStatus.NONE

) : AbstractAggregateRoot<Order>() {

    val id = this.identifier.identifier

    fun orderPaid() {

        this.orderStatus = OrderStatus.PAID

        registerEvent(OrderPaid.of(this))

    }

    data class OrderPaid(val order: Order) {

        companion object {

            fun of(order: Order): OrderPaid {

                return OrderPaid(order)

            }
        }
    }
}