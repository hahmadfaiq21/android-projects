package mobile.security.secretnotesapp.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mobile.security.secretnotesapp.R
import mobile.security.secretnotesapp.data.Note
import mobile.security.secretnotesapp.data.NoteRepository
import mobile.security.secretnotesapp.helper.Event

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()

    fun deleteNote(note: Note) {
        mNoteRepository.delete(note)
        _snackbarText.value = Event(R.string.deleted)
        _undo.value = Event(note)
    }

    private val _snackbarText = MutableLiveData<Event<Int>>()
    val snackbarText: LiveData<Event<Int>> = _snackbarText

    private val _undo = MutableLiveData<Event<Note>>()
    val undo: LiveData<Event<Note>> = _undo

    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }

    fun searchNote(query: String): LiveData<List<Note>> {
        return mNoteRepository.searchNote(query)
    }

}