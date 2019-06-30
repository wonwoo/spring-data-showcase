package ml.wonwoo.springdatashowcase.event

import ml.wonwoo.springdatashowcase.order.OrderStatus
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
data class Event(
        @Id val id: String,
        val orderId: String,
        val orderStatus: OrderStatus
)