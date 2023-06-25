package mobile.security.secretnotesapp.ui.main

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import mobile.security.secretnotesapp.data.Note
import mobile.security.secretnotesapp.databinding.ItemNoteBinding
import mobile.security.secretnotesapp.helper.NoteDiffCallback
import mobile.security.secretnotesapp.ui.pin.PinActivity
import java.util.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.NoteViewHolder>() {
    private val listNotes = ArrayList<Note>()
    fun setListNotes(listNotes: List<Note>) {
        val diffCallback = NoteDiffCallback(this.listNotes, listNotes)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.listNotes.clear()
        this.listNotes.addAll(listNotes)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(listNotes[position])
    }

    override fun getItemCount(): Int {
        return listNotes.size
    }

    inner class NoteViewHolder(private val binding: ItemNoteBinding) : RecyclerView.ViewHolder(binding.root) {
        lateinit var getNote: Note
        fun bind(note: Note) {
            getNote = note
            with(binding) {
                tvItemTitle.text = note.title
                tvItemDate.text = note.date
                cvItemNote.setOnClickListener {
                    val intent = Intent(it.context, PinActivity::class.java)
                    intent.putExtra(PinActivity.EXTRA_NOTE, note)
                    it.context.startActivity(intent)
                    (it.context as Activity).finish()
                }
            }
        }
    }
}