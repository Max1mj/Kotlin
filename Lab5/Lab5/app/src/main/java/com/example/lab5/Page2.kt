package com.example.lab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.lab5.databinding.ActivityPage2Binding
import android.widget.Toast

class Page2 : AppCompatActivity() {

    private lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val ChangedButton1: Button = binding.button4
        val ChangedButton2: Button = binding.button5
        val FocusedView: TextView = binding.textView4

        FocusedView.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                showToast("focused")
            }
        }

        ChangedButton1.setOnClickListener {

            ChangedButton2.text = "Name Changed"
            ChangedButton1.text = "ChangedButton1"

        }

        ChangedButton2.setOnClickListener {

            ChangedButton1.text = "Name Changed"
            ChangedButton2.text = "ChangedButton2"

        }

        binding.button3.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}