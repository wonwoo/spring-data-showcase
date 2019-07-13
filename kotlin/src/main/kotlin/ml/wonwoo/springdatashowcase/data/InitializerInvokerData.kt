package ml.wonwoo.springdatashowcase.data

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class InitializerInvokerData(private val initializerData: List<InitializerData>) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        initializerData.forEach { it.initialize() }
    }

    @Component
    class NoopInitializerData : InitializerData {

        override fun initialize() {

        }
    }
}