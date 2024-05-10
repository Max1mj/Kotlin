package com.example.lab4ft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        var buttontwo = findViewById<Button>(R.id.button2)
        buttontwo.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

        var buttonthree = findViewById<Button>(R.id.button3)
        buttonthree.setOnClickListener {
            val intent3 = Intent(this, Page3::class.java)
            startActivity(intent3)
        }
    }
}