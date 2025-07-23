package igoroffline.practice.reactiverain.main

import org.apache.commons.lang3.exception.ExceptionUtils
import org.jooq.codegen.GenerationTool
import org.jooq.meta.jaxb.Configuration
import org.jooq.meta.jaxb.Database
import org.jooq.meta.jaxb.Generator
import org.jooq.meta.jaxb.Jdbc
import org.jooq.meta.jaxb.Target
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class RainGenerator(val datasourceParams: RainDatasourceParams) {

    private val log = LoggerFactory.getLogger(RainGenerator::class.java)

    fun generate(doGenerate: Boolean) {
        if (doGenerate) {
            doGenerate()
        }
    }

    private fun doGenerate() {
        val configuration =
            Configuration().withJdbc(
                Jdbc().withDriver("org.postgresql.Driver").withUrl(datasourceParams.url.replace("r2dbc", "jdbc"))
                    .withUser(datasourceParams.username).withPassword(datasourceParams.password)
            )
                .withGenerator(
                    Generator().withDatabase(Database().withName("org.jooq.meta.postgres.PostgresDatabase")).withTarget(
                        Target().withPackageName("igoroffline.practice.reactiverain.generated")
                            .withDirectory("src/main/java")
                    )
                )

        try {
            GenerationTool.generate(configuration)
        } catch (e: Exception) {
            log.error(ExceptionUtils.getMessage(e))
            log.error(ExceptionUtils.getStackTrace(e))
        }
    }
}