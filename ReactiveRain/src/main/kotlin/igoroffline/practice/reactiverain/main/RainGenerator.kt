package igoroffline.practice.reactiverain.main

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class RainGenerator(val datasourceParams: RainDatasourceParams) {

    private val log = LoggerFactory.getLogger(RainGenerator::class.java)

    fun logPort() {
        log.info("datasourceParams= {}", datasourceParams)
    }
}