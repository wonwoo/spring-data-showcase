package ml.wonwoo.springdatashowcase.product

import ml.wonwoo.springdatashowcase.support.Identifier
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface Catalog<T : Product> : JpaRepository<T, Identifier> {

    fun findByName(name: String): List<T>

    @Query("select p from #{#entityName} p where p.name = :name")
    fun findName(name: String): List<T>

}