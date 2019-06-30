package ml.wonwoo.springdatashowcase.support

import org.javamoney.moneta.Money
import javax.money.CurrencyUnit
import javax.money.Monetary
import javax.money.MonetaryAmount

val USD: CurrencyUnit = Monetary.getCurrency("USD")

val ZERO: MonetaryAmount = Money.zero(USD)