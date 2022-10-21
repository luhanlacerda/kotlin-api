package lacerda.luhan.kotlinapi.repository

import lacerda.luhan.kotlinapi.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long> {

    fun findByTitle(title: String): Note

}