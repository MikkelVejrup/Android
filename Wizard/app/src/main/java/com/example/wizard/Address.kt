package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.EditText

class Address : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)
    }

    fun Next(view: View) {
        val name = intent.getStringExtra(mName)
        val editText = findViewById<EditText>(R.id.editTextTextPersonAddress)
        val message = editText.text.toString()
        val intent = Intent(this, Date::class.java).apply {
            putExtra(mAddress, message)
            putExtra(mName, name)
        }
        startActivity(intent)
    }

    fun Return(view: View) {
        val name = intent.getStringExtra(mName)
        val address = intent.getStringExtra(mAddress)
        val editText = findViewById<EditText>(R.id.editTextDate)
        val message = editText.text.toString()
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(mBday, message)
            putExtra(mAddress, address)
            putExtra(mName, name)
        }
        startActivity(intent)
    }

}