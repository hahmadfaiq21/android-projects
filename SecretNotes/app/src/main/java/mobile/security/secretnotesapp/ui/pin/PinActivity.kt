package mobile.security.secretnotesapp.ui.pin

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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

        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LOCKED

        pinViewModel = obtainViewModel(this@PinActivity)
        note = intent.getParcelableExtra(EXTRA_NOTE)
        if (note != null) {
            isEdit = true
        } else {
            note = Note()
        }

        binding?.btnConfirmation?.isEnabled = false
        if (isEdit) {
            binding?.btnConfirmation?.setOnClickListener {
                val inputPin = binding?.pin?.text.toString().trim()
                if (inputPin != note?.pin) {
                    val intent = Intent(this@PinActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                    showToast(resources.getString(R.string.wrong_pin))
                } else {
                    note?.let { note ->
                        val intent = Intent(this@PinActivity, AddNoteActivity::class.java)
                        intent.putExtra("extra_edit_note", note)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        } else {
            binding?.btnConfirmation?.setOnClickListener {
                saveNote()
            }
        }

        binding?.pin?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Do nothing.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val pin = s?.toString()?.trim()
                binding?.btnConfirmation?.isEnabled = !pin.isNullOrEmpty() && pin.length >= 4
            }

            override fun afterTextChanged(s: Editable?) {
                // Do nothing.
            }
        })
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
        val intent = Intent(this@PinActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun obtainViewModel(activity: AppCompatActivity): PinViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory)[PinViewModel::class.java]
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(isEdit){
            val intent = Intent(this@PinActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    companion object {
        const val EXTRA_NOTE = "extra_note"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_CONTENT = "extra_content"
    }
}