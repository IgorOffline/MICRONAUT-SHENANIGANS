package igoroffline.practice.reactiverain.main

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.reactive.result.view.Rendering

@Controller
@RequestMapping("/m")
class RainController {

    private val log = LoggerFactory.getLogger(RainController::class.java)

    @GetMapping("/hello")
    fun getHello(): Rendering {
        val str = "GET /m/hello"
        log.info(str)
        return Rendering.view("hello").build()
    }

    @GetMapping("/selecta")
    fun getSelecta(): Rendering {
        val str = "GET /m/selecta"
        log.info(str)
        return Rendering.view("selecta").build()
    }
}