package ml.wonwoo.springdatashowcase.support

import java.util.*
import javax.money.MonetaryAmount
import javax.money.format.MonetaryFormats
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class MonetaryAmountAttributeConverter : AttributeConverter<MonetaryAmount, String> {

    private val format = MonetaryFormats.getAmountFormat(Locale.ROOT);

    override fun convertToDatabaseColumn(amount: MonetaryAmount?): String? {
        return amount?.toString()
    }

    override fun convertToEntityAttribute(source: String?): MonetaryAmount? {
        return (source ?: format.parse(source)) as MonetaryAmount
    }

}