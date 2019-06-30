package ml.wonwoo.springdatashowcase.event;

import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, String> {

}
