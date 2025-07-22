package igoroffline.practice.reactiverain.main

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.result.view.freemarker.FreeMarkerViewResolver

@Configuration
class ViewResolverConfig {

    @Bean
    fun freeMarkerViewResolver(): FreeMarkerViewResolver {
        val resolver = FreeMarkerViewResolver()
        resolver.setPrefix("")
        resolver.setSuffix(".ftl")
        resolver.order = 1
        return resolver
    }
}