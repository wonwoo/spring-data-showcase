package ml.wonwoo.springdatashowcase.product

import javax.money.MonetaryAmount
import javax.persistence.Entity

@Entity
data class Disc(

        override val name: String,
        val image: String,
        val genre: String,
        override val price: MonetaryAmount,
        val type: DiscType

) : Product(name = name, price = price)

enum class DiscType {

    BLURAY, DVD

}