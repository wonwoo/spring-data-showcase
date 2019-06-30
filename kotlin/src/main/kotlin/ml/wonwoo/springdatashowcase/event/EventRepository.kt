package ml.wonwoo.springdatashowcase.event

import org.springframework.data.repository.CrudRepository

interface EventRepository : CrudRepository<Event, String>