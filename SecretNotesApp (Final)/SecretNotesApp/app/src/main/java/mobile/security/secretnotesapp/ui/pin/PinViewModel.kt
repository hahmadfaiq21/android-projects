package mobile.security.secretnotesapp.ui.pin

import android.app.Application
import androidx.lifecycle.ViewModel
import mobile.security.secretnotesapp.data.Note
import mobile.security.secretnotesapp.data.NoteRepository

class PinViewModel(application: Application) : ViewModel() {

    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }

    fun update(note: Note) {
        mNoteRepository.update(note)
    }

    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }

}