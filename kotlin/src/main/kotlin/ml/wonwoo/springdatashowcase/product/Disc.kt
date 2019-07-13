package ml.wonwoo.springdatashowcase.product

import javax.money.MonetaryAmount
import javax.persistence.Entity

@Entity
data class Disc(

    override val name: String,

    override val price: MonetaryAmount,

    val image: String,

    val genre: String,

    val type: DiscType

) : Product(name = name, price = price)


enum class DiscType {

    BLURAY, DVD

}