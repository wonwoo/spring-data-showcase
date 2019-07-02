package ml.wonwoo.springdatashowcase.data

import org.springframework.transaction.annotation.Transactional

interface InitializerData {

    @Transactional
    fun initialize()

}