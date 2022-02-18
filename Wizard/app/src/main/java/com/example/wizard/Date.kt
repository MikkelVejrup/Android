package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.CalendarView
import android.widget.EditText
import android.widget.TextView

class Date : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)



    }

    fun Next(view: View) {
        val name = intent.getStringExtra(mName)
        val address = intent.getStringExtra(mAddress)
        val editText = findViewById<EditText>(R.id.editTextDate)
        val message = editText.text.toString()
        val intent = Intent(this, SUM::class.java).apply {
            putExtra(mBday, message)
            putExtra(mAddress, address)
            putExtra(mName, name)
        }
        startActivity(intent)
    }

    fun Return(view: View) {
        val name = intent.getStringExtra(mName)
        val address = intent.getStringExtra(mAddress)
        val editText = findViewById<EditText>(R.id.editTextDate)
        val message = editText.text.toString()
        val intent = Intent(this, Address::class.java).apply {
            putExtra(mBday, message)
            putExtra(mAddress, address)
            putExtra(mName, name)
        }
        startActivity(intent)
    }
}