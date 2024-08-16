package mobile.security.secretnotesapp.ui.main

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.database.Cursor
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import mobile.security.secretnotesapp.R
import mobile.security.secretnotesapp.data.Note
import mobile.security.secretnotesapp.data.NoteRoomDatabase
import mobile.security.secretnotesapp.databinding.ActivityMainBinding
import mobile.security.secretnotesapp.helper.Event
import mobile.security.secretnotesapp.helper.ViewModelFactory
import mobile.security.secretnotesapp.ui.add.AddNoteActivity
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    private var _activityMainBinding: ActivityMainBinding? = null
    private val binding get() = _activityMainBinding

    private lateinit var adapter: MainAdapter
    private lateinit var noteDatabase: NoteRoomDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LOCKED

        noteDatabase = NoteRoomDatabase.getDatabase(this)
        val mainViewModel = obtainViewModel(this@MainActivity)
        mainViewModel.getAllNotes().observe(this) { noteList ->
            if (noteList.isNotEmpty()) {
                adapter.setListNotes(noteList)
                isNoteEmpty(false)
            } else {
                isNoteEmpty(true)
            }
        }
        adapter = MainAdapter()

        binding?.rvNotes?.layoutManager = GridLayoutManager(this,2)
        binding?.rvNotes?.setHasFixedSize(true)
        binding?.rvNotes?.adapter = adapter

        binding?.btnAddNote?.setOnClickListener {
                val intent = Intent(this@MainActivity, AddNoteActivity::class.java)
                startActivity(intent)
                finish()
        }

        binding?.btnSearch?.setOnClickListener {
            val query = binding?.etQuery?.text.toString()
            val searchQuery = "%$query%"
            mainViewModel.searchNote(searchQuery).observe(this){
                adapter.setListNotes(it)
            }
            binding?.coordinatorLayout?.visibility = View.VISIBLE
            isNoteEmpty(false)
            hideKeyboard()
        }

        binding?.etQuery?.setOnEditorActionListener { textView, i, _ ->
            return@setOnEditorActionListener when (i) {
                EditorInfo.IME_ACTION_SEARCH -> {
                    val query = textView.text.toString()
                    when (isValidSearch(query)){
                        true -> {
                            val searchQuery = "%$query%"
                            mainViewModel.searchNote(searchQuery).observe(this){
                                adapter.setListNotes(it)
                            }
                            binding?.coordinatorLayout?.visibility = View.VISIBLE
                            isNoteEmpty(false)
                            hideKeyboard()
                        }
                        false -> {
                            val searchQuery = "%$query%"
                            val cursor: Cursor = noteDatabase.query("SELECT * FROM note WHERE title LIKE '$searchQuery'", null)
                            cursor.moveToFirst()
                            var result: String? = ""
                            while (!cursor.isAfterLast) {
                                result += """
                                            id: ${cursor.getInt(0)}
                                            pin: ${cursor.getString(1)}
                                            title: ${cursor.getString(2)}
                                            content: ${cursor.getString(3)}
                                            date: ${cursor.getString(4)}
                
                
                                            """.trimIndent()
                                cursor.moveToNext()
                            }
                            cursor.close()
                            binding?.coordinatorLayout?.visibility = View.GONE
                            isNoteEmpty(false)
                            hideKeyboard()
                        }
                    }
                    true
                }
                else -> false
            }
        }
        initAction()
    }

    private fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    private fun Context.hideKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun obtainViewModel(activity: AppCompatActivity): MainViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory)[MainViewModel::class.java]
    }

    private fun isNoteEmpty(state: Boolean) {
        if (state){
            binding?.noteHint?.visibility = View.VISIBLE
        } else {
            binding?.noteHint?.visibility = View.GONE
        }
    }

    private fun initAction() {
        val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
            override fun getMovementFlags(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder
            ): Int {
                return makeMovementFlags(0, ItemTouchHelper.RIGHT)
            }

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val note = (viewHolder as MainAdapter.NoteViewHolder).getNote
                val mainViewModel = obtainViewModel(this@MainActivity)
                mainViewModel.deleteNote(note)
                mainViewModel.snackbarText.observe(this@MainActivity){
                    showSnackBar(it)
                }
            }
        })
        itemTouchHelper.attachToRecyclerView(binding?.rvNotes)
    }

    private fun showSnackBar(eventMessage: Event<Int>) {
        val mainViewModel = obtainViewModel(this@MainActivity)
        val message = eventMessage.getContentIfNotHandled() ?: return
        Snackbar.make(
            findViewById(R.id.coordinator_layout),
            getString(message),
            Snackbar.LENGTH_SHORT
        ).setAction("Cancel"){
            mainViewModel.insert(mainViewModel.undo.value?.getContentIfNotHandled() as Note)
        }.show()
    }

    private fun isValidSearch(input: String): Boolean {
        val namePattern = "^[0-9 a-z]*$"
        val pattern = Pattern.compile(namePattern)
        val matcher = pattern.matcher(input)
        return matcher.matches()
    }

    override fun onResume() {
        super.onResume()
        val mainViewModel = obtainViewModel(this@MainActivity)
        mainViewModel.getAllNotes().observe(this) { noteList ->
            adapter.setListNotes(noteList)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _activityMainBinding = null
    }
}