package ml.wonwoo.springdatashowcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringDataShowcaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataShowcaseApplication.class, args);
    }

}
