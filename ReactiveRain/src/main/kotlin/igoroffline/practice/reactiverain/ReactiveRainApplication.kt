package igoroffline.practice.reactiverain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveRainApplication

fun main(args: Array<String>) {
	runApplication<ReactiveRainApplication>(*args)
}
