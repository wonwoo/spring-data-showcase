package ml.wonwoo.springdatashowcase.support

import java.io.Serializable
import java.util.*
import javax.persistence.MappedSuperclass

@MappedSuperclass
data class Identifier(private val _id: String) : Serializable {

    val identifier: String = _id

    constructor() : this(UUID.randomUUID().toString())

}
