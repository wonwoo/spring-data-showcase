package ml.wonwoo.springdatashowcase.product

import javax.money.MonetaryAmount
import javax.persistence.Entity

@Entity
data class Book(

    override val name: String,

    override val price: MonetaryAmount,

    val image: String,

    val author: String,

    val type: BookType

) : Product(name = name, price = price)

enum class BookType {
    SOFTWARE,
    SCIENCE,
    FANTASY
}
