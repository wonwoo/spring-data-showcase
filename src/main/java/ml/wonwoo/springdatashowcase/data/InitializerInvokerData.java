package ml.wonwoo.springdatashowcase.data;

import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializerInvokerData implements ApplicationRunner {

    private final List<InitializerData> initializerData;

    public InitializerInvokerData(List<InitializerData> initializerData) {
        this.initializerData = initializerData;
    }


    @Override
    public void run(ApplicationArguments args) {
        this.initializerData.forEach(InitializerData::initialize);
    }

    @Component
    static class NoOpDataInitializer implements InitializerData {

        @Override
        public void initialize() {

        }
    }
}
