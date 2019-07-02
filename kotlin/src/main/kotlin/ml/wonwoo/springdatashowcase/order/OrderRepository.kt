package ml.wonwoo.springdatashowcase.order

import ml.wonwoo.springdatashowcase.support.Identifier
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Identifier>