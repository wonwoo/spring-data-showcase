package ml.wonwoo.springdatashowcase.support

import ml.wonwoo.springdatashowcase.product.Book
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.money.MonetaryAmount


inline fun <reified T> logger(): Logger {

    return LoggerFactory.getLogger(T::class.java)

}


fun List<Book>.getTotal(): MonetaryAmount {

    return this.map { it.price }.reduce ( MonetaryAmount::add )

}