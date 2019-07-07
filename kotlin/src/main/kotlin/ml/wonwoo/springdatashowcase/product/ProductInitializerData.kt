package ml.wonwoo.springdatashowcase.product

import ml.wonwoo.springdatashowcase.data.InitializerData
import ml.wonwoo.springdatashowcase.extensions.getTotal
import ml.wonwoo.springdatashowcase.support.USD
import org.javamoney.moneta.Money
import org.springframework.stereotype.Component

@Component
class ProductInitializerData(private val bookCatalog: BookCatalog) : InitializerData {

    override fun initialize() {

        bookCatalog.save(Book("Effective Java", "http://localhost:8080",
                "Joshua Bloch", Money.of(3.99, USD), BookType.SOFTWARE))

        bookCatalog.save(Book("Effective Java", "http://localhost:8080",
                "Joshua Bloch", Money.of(8.99, USD), BookType.SOFTWARE))

        bookCatalog.save(Book("Back to the Future", "http://localhost:8080",
                "Michael Klastorin", Money.of(6.99, USD), BookType.FANTASY))

        val books = bookCatalog.findByAuthor("Joshua Bloch")

        println(books.getTotal())

    }

}
