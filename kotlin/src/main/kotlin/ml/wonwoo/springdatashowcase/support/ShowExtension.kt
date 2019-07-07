package ml.wonwoo.springdatashowcase.support

import ml.wonwoo.springdatashowcase.product.Product
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.money.MonetaryAmount


inline fun <reified T> logger(): Logger {

    return LoggerFactory.getLogger(T::class.java)

}


fun List<Product>.getTotal(): MonetaryAmount {

    return this.map { it.price }.fold(ZERO, MonetaryAmount::add)

}