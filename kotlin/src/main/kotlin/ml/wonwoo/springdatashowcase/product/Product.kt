package ml.wonwoo.springdatashowcase.product

import ml.wonwoo.springdatashowcase.support.Identifier
import javax.money.MonetaryAmount
import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.MappedSuperclass


@MappedSuperclass
open class Product(

    @EmbeddedId
    @AttributeOverride(name = "id", column = Column(name = "PRODUCT_ID"))
    val productIdentifier: Identifier = Identifier(),

    open val name: String,

    open val price: MonetaryAmount

)

