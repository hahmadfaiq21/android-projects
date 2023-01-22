package mobile.security.secretnotesapp.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("SELECT * from note ORDER BY date DESC")
    fun getAllNotes(): LiveData<List<Note>>

    @Query("SELECT * from note WHERE title LIKE :query ORDER BY date DESC")
    fun searchNote(query: String): LiveData<List<Note>>
}