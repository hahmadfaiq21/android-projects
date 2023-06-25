package mobile.security.secretnotesapp.ui.add

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import mobile.security.secretnotesapp.R
import mobile.security.secretnotesapp.data.Note
import mobile.security.secretnotesapp.databinding.ActivityAddNoteBinding
import mobile.security.secretnotesapp.helper.DateHelper
import mobile.security.secretnotesapp.helper.ViewModelFactory
import mobile.security.secretnotesapp.ui.main.MainActivity
import mobile.security.secretnotesapp.ui.pin.PinActivity

@Suppress("DEPRECATION")
class AddNoteActivity : AppCompatActivity() {

    private var isEdit = false
    private var note: Note? = null
    private lateinit var addNoteViewModel: AddNoteViewModel

    private var _activityNoteAddUpdateBinding: ActivityAddNoteBinding? = null
    private val binding get() = _activityNoteAddUpdateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _activityNoteAddUpdateBinding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LOCKED

        addNoteViewModel = obtainViewModel(this@AddNoteActivity)

        binding?.edtContent?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                binding?.charCount?.text = resources.getString(R.string.char_count, s.length.toString())
            }

            override fun afterTextChanged(s: Editable) {
                // Do nothing.
            }
        })
        note = intent.getParcelableExtra(EXTRA_EDIT_NOTE)
        if (note != null) {
            isEdit = true
        } else {
            note = Note()
        }

        val actionBarTitle: String

        if (isEdit) {
            actionBarTitle = getString(R.string.change)
            if (note != null) {
                note?.let { note ->
                    binding?.edtTitle?.setText(note.title)
                    binding?.edtContent?.setText(note.content)
                    note.date = DateHelper.getCurrentDate()
                }
            }
        } else {
            actionBarTitle = getString(R.string.add)
        }

        supportActionBar?.title = actionBarTitle
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        if (isEdit) {
            menuInflater.inflate(R.menu.menu_form, menu)
        } else {
            menuInflater.inflate(R.menu.menu_add, menu)
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_delete -> showAlertDialog(ALERT_DIALOG_DELETE)
            android.R.id.home -> showAlertDialog(ALERT_DIALOG_CLOSE)
            R.id.action_save -> saveNote()
        }
        return super.onOptionsItemSelected(item)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        showAlertDialog(ALERT_DIALOG_CLOSE)
    }

    private fun saveNote() {
        val title = binding?.edtTitle?.text.toString().trim()
        val content = binding?.edtContent?.text.toString().trim()

        when {
            title.isEmpty() -> {
                binding?.edtTitle?.error = getString(R.string.empty)
            }
            else -> {
                note.let { note ->
                    note?.title = title
                    note?.content = content
                }
                if (isEdit) {
                    addNoteViewModel.update(note as Note)
                    val intent = Intent(this@AddNoteActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                    showToast(getString(R.string.changed))
                } else {
                    val intent = Intent(this@AddNoteActivity, PinActivity::class.java)
                    intent.putExtra("extra_title", title)
                    intent.putExtra("extra_content", content)
                    startActivity(intent)
                }
                hideKeyboard()
            }
        }
    }

    private fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    private fun Context.hideKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun showAlertDialog(type: Int) {
        val isDialogClose = type == ALERT_DIALOG_CLOSE
        val dialogTitle: String
        val dialogMessage: String
        if (isDialogClose) {
            dialogTitle = getString(R.string.cancel)
            dialogMessage = getString(R.string.message_cancel)
        } else {
            dialogMessage = getString(R.string.message_delete)
            dialogTitle = getString(R.string.delete)
        }
        val alertDialogBuilder = AlertDialog.Builder(this)
        with(alertDialogBuilder) {
            setTitle(dialogTitle)
            setMessage(dialogMessage)
            setCancelable(false)
            setPositiveButton(getString(R.string.yes)) { _, _ ->
                if (!isDialogClose) {
                    addNoteViewModel.delete(note as Note)
                    val intent = Intent(this@AddNoteActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                    showToast(getString(R.string.deleted))
                }else {
                    val intent = Intent(this@AddNoteActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
            setNegativeButton(getString(R.string.no)) { dialog, _ -> dialog.cancel() }
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        _activityNoteAddUpdateBinding = null
    }

    private fun obtainViewModel(activity: AppCompatActivity): AddNoteViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory)[AddNoteViewModel::class.java]
    }

    companion object {
        const val EXTRA_EDIT_NOTE = "extra_edit_note"
        const val ALERT_DIALOG_CLOSE = 10
        const val ALERT_DIALOG_DELETE = 20
    }
}