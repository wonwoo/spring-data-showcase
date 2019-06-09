package ml.wonwoo.springdatashowcase.product;

import ml.wonwoo.springdatashowcase.support.Identifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.util.Streamable;

@NoRepositoryBean
public interface Catalog<T extends Product> extends JpaRepository<T, Identifier> {

    Streamable<T> findByName(String name);

    @Query("select p from #{#entityName} p where p.name = :name")
    Streamable<T> findName(String name);
}
