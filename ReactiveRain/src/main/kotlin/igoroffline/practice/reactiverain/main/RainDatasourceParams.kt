package igoroffline.practice.reactiverain.main

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("spring.r2dbc")
data class RainDatasourceParams(val url: String, val username: String, val password: String)
