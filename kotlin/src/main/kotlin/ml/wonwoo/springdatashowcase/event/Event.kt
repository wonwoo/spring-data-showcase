package ml.wonwoo.springdatashowcase.event

import ml.wonwoo.springdatashowcase.order.Order
import ml.wonwoo.springdatashowcase.order.OrderStatus
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
data class Event(

    @Id val id: String? = null,

    val orderId: String,

    val orderStatus: OrderStatus

) {

    constructor(order: Order) : this(orderId = order.id, orderStatus = order.orderStatus)
}