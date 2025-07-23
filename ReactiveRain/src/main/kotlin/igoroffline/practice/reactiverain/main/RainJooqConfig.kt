package igoroffline.practice.reactiverain.main

import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DefaultDSLContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class RainJooqConfig {

    @Bean
    fun dsl(dataSource: DataSource): DSLContext {
        return DefaultDSLContext(dataSource, SQLDialect.POSTGRES)
    }
}