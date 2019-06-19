package ml.wonwoo.springdatashowcase.support;

import ml.wonwoo.springdatashowcase.event.Event;
import org.springframework.core.Ordered;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.stereotype.Component;

@Component
public class EventBeforeConvertCallback implements BeforeConvertCallback<Event>, Ordered {

    @Override
    public Event onBeforeConvert(Event entity, String collection) {
        return entity;
    }

    @Override
    public int getOrder() {
        return 200;
    }
}
