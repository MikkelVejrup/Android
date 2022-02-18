package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
const val mName = "name";
const val mAddress = "Address";
const val mBday = "Bday";

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun Next(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonAddress)
        val message = editText.text.toString()
        val intent = Intent(this, Address::class.java).apply {
            putExtra(mName, message)
        }
        startActivity(intent)
    }



}