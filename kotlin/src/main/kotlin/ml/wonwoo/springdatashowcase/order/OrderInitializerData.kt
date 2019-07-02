package ml.wonwoo.springdatashowcase.order

import ml.wonwoo.springdatashowcase.data.InitializerData
import org.springframework.stereotype.Component

@Component
class OrderInitializerData(private val orderRepository: OrderRepository)
    : InitializerData {

    override fun initialize() {

        val order = orderRepository.save(Order())

        order.orderPaid()

        orderRepository.save(order)

    }
}