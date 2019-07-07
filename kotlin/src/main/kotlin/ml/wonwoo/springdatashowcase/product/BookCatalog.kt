package ml.wonwoo.springdatashowcase.product

interface BookCatalog : Catalog<Book> {

    fun findByAuthor(author: String): List<Book>

}