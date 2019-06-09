package ml.wonwoo.springdatashowcase.support;

import java.util.Locale;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import org.javamoney.moneta.Money;

@Converter(autoApply = true)
public class MonetaryAmountAttributeConverter implements AttributeConverter<MonetaryAmount, String> {

    private static final MonetaryAmountFormat FORMAT = MonetaryFormats.getAmountFormat(Locale.ROOT);

    @Override
    public String convertToDatabaseColumn(MonetaryAmount amount) {
        return amount == null ? null : amount.toString();
    }

    @Override
    public MonetaryAmount convertToEntityAttribute(String source) {

        if (source == null) {
            return null;
        }

        try {
            return Money.parse(source);
        } catch (RuntimeException e) {
            return Money.parse(source, FORMAT);
        }
    }
}

