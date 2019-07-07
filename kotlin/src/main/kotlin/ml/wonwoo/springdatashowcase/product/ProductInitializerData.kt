package ml.wonwoo.springdatashowcase.product

import ml.wonwoo.springdatashowcase.data.InitializerData
import ml.wonwoo.springdatashowcase.support.USD
import ml.wonwoo.springdatashowcase.support.getTotal
import ml.wonwoo.springdatashowcase.support.logger
import org.javamoney.moneta.Money
import org.springframework.stereotype.Component

@Component
class ProductInitializerData(private val bookCatalog: BookCatalog,
                             private val discCatalog: DiscCatalog) : InitializerData {

    val logger = logger<ProductInitializerData>()

    override fun initialize() {

        bookCatalog.save(Book("Effective Java", "http://localhost:8080",
                "Joshua Bloch", Money.of(3.99, USD), BookType.SOFTWARE))

        bookCatalog.save(Book("Effective Java", "http://localhost:8080",
                "Joshua Bloch", Money.of(8.99, USD), BookType.SOFTWARE))

        bookCatalog.save(Book("Back to the Future", "http://localhost:8080",
                "Michael Klastorin", Money.of(6.99, USD), BookType.FANTASY))

        discCatalog.save(Disc("Back to the Future", "http://localhost:8080",
                "Sci-Fi", Money.of(5.99, USD), DiscType.BLURAY))

        val books = bookCatalog.findByAuthor("Joshua Bloch")

        logger.info("${books.getTotal()}")

        val discs = discCatalog.findByGenre("Sci-Fi")

        logger.info("${discs.getTotal()}")

    }

}
