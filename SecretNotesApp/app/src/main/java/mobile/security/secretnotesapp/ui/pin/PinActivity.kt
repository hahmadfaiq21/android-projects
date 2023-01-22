package mobile.security.secretnotesapp.ui.pin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import mobile.security.secretnotesapp.R
import mobile.security.secretnotesapp.data.Note
import mobile.security.secretnotesapp.databinding.ActivityPinBinding
import mobile.security.secretnotesapp.helper.DateHelper
import mobile.security.secretnotesapp.helper.ViewModelFactory
import mobile.security.secretnotesapp.ui.add.AddNoteActivity
import mobile.security.secretnotesapp.ui.main.MainActivity

@Suppress("DEPRECATION")
class PinActivity : AppCompatActivity() {

    private var isEdit = false
    private var note: Note? = null
    private lateinit var pinViewModel: PinViewModel

    private var _activityPinBinding: ActivityPinBinding? = null
    private val binding get() = _activityPinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _activityPinBinding = ActivityPinBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        pinViewModel = obtainViewModel(this@PinActivity)
        note = intent.getParcelableExtra(EXTRA_NOTE)
        if (note != null) {
            isEdit = true
        } else {
            note = Note()
        }

        if (isEdit) {
            binding?.btnConfirmation?.setOnClickListener {
                val inputPin = binding?.pin?.text.toString().trim()
                if (inputPin != note?.pin) {
                    Intent(this@PinActivity, MainActivity::class.java).also {
                        startActivity(it)
                    }
                    finish()
                    showToast(resources.getString(R.string.wrong_pin))
                } else {
                    note?.let { note ->
                        Intent(this@PinActivity, AddNoteActivity::class.java).also {
                            it.putExtra("extra_edit_note", note)
                            startActivity(it)
                        }
                        finish()
                    }
                }
            }
        } else {
            binding?.btnConfirmation?.setOnClickListener {
                saveNote()
                finish()
            }
        }
    }

    private fun saveNote() {
        val title = intent.getStringExtra(EXTRA_TITLE)
        val content = intent.getStringExtra(EXTRA_CONTENT)
        val pin = binding?.pin?.text.toString().trim()

        if (isEdit) {
            pinViewModel.update(note as Note)
            showToast(getString(R.string.changed))
        } else {
            note.let { note ->
                note?.title = title
                note?.content = content
                note?.pin = pin
                note?.date = DateHelper.getCurrentDate()
            }
            pinViewModel.insert(note as Note)
            showToast(getString(R.string.added))
        }
        Intent(this@PinActivity, MainActivity::class.java).also {
            startActivity(it)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun obtainViewModel(activity: AppCompatActivity): PinViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory)[PinViewModel::class.java]
    }

    companion object {
        const val EXTRA_NOTE = "extra_note"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_CONTENT = "extra_content"
    }
}