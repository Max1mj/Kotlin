package com.example.lab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.lab5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val topView: TextView = binding.textView
        val underView: TextView = binding.textView5
        val myEdif: EditText = binding.editTextText2
        val myEdif2: EditText = binding.editTextText3
        val myChangeButton: Button = binding.button1
        val myTextView: TextView = binding.textView2

        myEdif.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {

                underView.text = "myEdif got focus!"
            } else {

                underView.text = "unfocused"
            }
        }

        val textChangeListener = MyTextChangeListener(topView)
        myEdif2.addTextChangedListener(textChangeListener)

        myChangeButton.setOnClickListener {
            myTextView.text = "Successfully Changed!"
        }

        binding.button2.setOnClickListener {
            val intent1 = Intent(this, Page2::class.java)
            startActivity(intent1)
        }
    }
}

class MyTextChangeListener(private val textViewToUpdate: TextView) : TextWatcher {
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    override fun afterTextChanged(s: Editable?) {
        textViewToUpdate.text = s
    }
}