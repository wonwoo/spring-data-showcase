package ml.wonwoo.springdatashowcase.order

import ml.wonwoo.springdatashowcase.event.Event
import ml.wonwoo.springdatashowcase.event.EventRepository
import ml.wonwoo.springdatashowcase.order.Order.*
import ml.wonwoo.springdatashowcase.support.logger
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class OrderEventListener(private val eventRepository: EventRepository) {

    companion object {
        val logger = logger<OrderEventListener>()
    }

    @EventListener
    fun orderPaid(orderPaid: OrderPaid) {

        val order = orderPaid.order

        this.eventRepository.save(Event(order))

        logger.info("Publisher event $order")

    }
}