package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SUM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)
        // Get the Intent that started this activity and extract the string
        val Bday = intent.getStringExtra(mBday)
        val Address = intent.getStringExtra(mAddress)
        val Name = intent.getStringExtra(mName)

        // Capture the layout's TextView and set the string as its text
        val textView1 = findViewById<TextView>(R.id.Date).apply {
            text = Bday
        }
        val textView2 = findViewById<TextView>(R.id.address).apply {
            text = Address
        }
        val textView3 = findViewById<TextView>(R.id.name).apply {
            text = Name
        }

    }

    fun Return(view: View) {
        val name = intent.getStringExtra(mName)
        val address = intent.getStringExtra(mAddress)
        val bday = intent.getStringExtra(mBday)
        val intent = Intent(this, Date::class.java).apply {
            putExtra(mBday, bday)
            putExtra(mAddress, address)
            putExtra(mName, name)
        }
        startActivity(intent)
    }

}
