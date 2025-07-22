package igoroffline.practice.reactiverain.main

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/e")
class RenataController {

    private val log = LoggerFactory.getLogger(RenataController::class.java)

    @GetMapping("/hello")
    fun getHello(): Mono<String> {
        val str = "GET /e/hello"
        log.info(str)
        return Mono.just(str)
    }
}