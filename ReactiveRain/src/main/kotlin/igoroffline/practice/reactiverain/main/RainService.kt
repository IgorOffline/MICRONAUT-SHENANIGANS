package igoroffline.practice.reactiverain.main

import igoroffline.practice.reactiverain.generated.public_.tables.Album
import org.jooq.DSLContext
import org.springframework.stereotype.Service

@Service
class RainService(val dsl: DSLContext) {

    fun albumsSelectCount(): Int {
        return dsl.selectCount().from(Album.ALBUM).fetch().size
    }
}