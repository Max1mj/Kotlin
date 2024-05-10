package com.example.lab4ft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        var buttonfour = findViewById<Button>(R.id.button4)
        buttonfour.setOnClickListener {
            val intent3 = Intent(this, Page2::class.java)
            startActivity(intent3)
        }
    }
}