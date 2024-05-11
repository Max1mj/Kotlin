package com.example.lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.EditText
import com.example.lab6.databinding.ActivityMainBinding

private const val TAG = "## Activity A"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editone: EditText = binding.edit1

        binding.button.setOnClickListener {
            val model = ("Car")
            val intent1 = Intent(this, Page2::class.java).apply {
                putExtra("string_val", "GFT")
                putExtra("int_val", 1)
                putExtra("model", model)
            }
            startActivity(intent1)
        }
        Log.d(TAG, "onCreate")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("edit_text_value", binding.edit1.text.toString())
        Log.d("Alert", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val editTextValue = savedInstanceState.getString("edit_text_value")
        binding.edit1.setText(editTextValue)
        Log.d("Alert", "onRestoreInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStop(){
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}