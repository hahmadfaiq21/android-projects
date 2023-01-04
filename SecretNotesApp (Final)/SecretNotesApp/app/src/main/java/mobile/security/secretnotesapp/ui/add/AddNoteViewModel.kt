package mobile.security.secretnotesapp.ui.add

import android.app.Application
import androidx.lifecycle.ViewModel
import mobile.security.secretnotesapp.data.Note
import mobile.security.secretnotesapp.data.NoteRepository

class AddNoteViewModel(application: Application) : ViewModel() {

    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun update(note: Note) {
        mNoteRepository.update(note)
    }

    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }

}