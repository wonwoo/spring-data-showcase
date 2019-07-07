package ml.wonwoo.springdatashowcase.extensions

import ml.wonwoo.springdatashowcase.product.Book
import javax.money.MonetaryAmount


fun List<Book>.getTotal(): MonetaryAmount {

    return this.map { it.price }.reduce { m, m1 -> m.add(m1) }

}