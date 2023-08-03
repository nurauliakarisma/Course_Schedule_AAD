package com.dicoding.courseschedule.ui.add

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.util.TimePickerFragment
import com.google.android.material.textfield.TextInputEditText
import java.text.SimpleDateFormat
import java.util.*

class AddCourseActivity : AppCompatActivity(), TimePickerFragment.DialogTimeListener {

    private lateinit var viewModel: AddCourseViewModel
    private lateinit var selectedView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_course)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.add_course)

        val factory = AddViewModelFactory.createFactory(this)
        viewModel = ViewModelProvider(this, factory).get(AddCourseViewModel::class.java)

        viewModel.saved.observe(this) { event ->
            event.getContentIfNotHandled()?.let { saved ->
                if (saved) {
                    onBackPressed()
                } else {
                    val message = getString(R.string.input_empty_message)
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_add, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_insert -> {
                val courseName =
                    findViewById<TextInputEditText>(R.id.ed_course_name).text.toString().trim()
                val day = findViewById<Spinner>(R.id.spinner_day).selectedItemPosition
                val startTime =
                    findViewById<TextView>(R.id.add_text_start_time).text.toString().trim()
                val endTime = findViewById<TextView>(R.id.add_text_end_time).text.toString().trim()
                val lecturer =
                    findViewById<TextInputEditText>(R.id.ed_lecturer).text.toString().trim()
                val note = findViewById<TextInputEditText>(R.id.ed_note).text.toString().trim()

                viewModel.insertCourse(courseName, day, startTime, endTime, lecturer, note)

                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    fun showStartTimePicker(view: View) {
        selectedView = view
        val startTimePicker = TimePickerFragment().show(
            supportFragmentManager, "startTime"
        )
    }

    fun showEndTimePicker(view: View) {
        selectedView = view
        val endTimePicker = TimePickerFragment().show(
            supportFragmentManager, "endTime"
        )
    }

    override fun onDialogTimeSet(tag: String?, hour: Int, minute: Int) {
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, hour)
            set(Calendar.MINUTE, minute)
        }

        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())

        when (selectedView.id) {
            R.id.ib_start_time -> {
                findViewById<TextView>(R.id.add_text_start_time).text =
                    timeFormat.format(calendar.time)
            }

            R.id.ib_end_time -> {
                findViewById<TextView>(R.id.add_text_end_time).text =
                    timeFormat.format(calendar.time)
            }
        }
    }
}