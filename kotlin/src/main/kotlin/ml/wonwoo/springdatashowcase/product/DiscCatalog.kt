package ml.wonwoo.springdatashowcase.product

interface DiscCatalog : Catalog<Disc> {

    fun findByGenre(genre: String) : List<Disc>

}