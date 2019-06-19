package ml.wonwoo.springdatashowcase.support;

import ml.wonwoo.springdatashowcase.event.Event;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveCallback;

@Configuration
public class EntityCallbackConfiguration {

    @Bean
    BeforeSaveCallback<Event> beforeSaveCallback() {
        return (entity, document, collection) -> entity;
    }

    @Bean
    BeforeConvertCallback<Event> beforeConvertCallback() {
        return (entity, collection) -> entity;
    }
}
