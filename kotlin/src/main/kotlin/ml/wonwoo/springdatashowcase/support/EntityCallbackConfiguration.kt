package ml.wonwoo.springdatashowcase.support

import ml.wonwoo.springdatashowcase.event.Event
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveCallback

@Configuration(proxyBeanMethods = false)
class EntityCallbackConfiguration {

    @Bean
    fun beforeSaveCallback(): BeforeSaveCallback<Event> {

        return BeforeSaveCallback { entity, _, _ -> entity }

    }

    @Bean
    fun beforeConvertCallback(): BeforeConvertCallback<Event> {

        return BeforeConvertCallback { entity, _ -> entity }

    }

}