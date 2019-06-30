package ml.wonwoo.springdatashowcase.support;

import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

public class Currencies {

    public static final CurrencyUnit USD = Monetary.getCurrency("USD");

    public static final MonetaryAmount ZERO = Money.zero(USD);

}
