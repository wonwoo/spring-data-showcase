package ml.wonwoo.springdatashowcase.data;

import org.springframework.transaction.annotation.Transactional;

public interface InitializerData {

    @Transactional
    void initialize();

}
