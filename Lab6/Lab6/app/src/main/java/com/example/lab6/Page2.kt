package com.example.lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.lab6.databinding.ActivityPage2Binding

private const val TAG = "## Activity B"


class Page2 : AppCompatActivity() {

    private lateinit var binding: ActivityPage2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val application = Application("Simple App", 11, 2015, "Alfred Smith")
            val intent2 = Intent(this, Page3::class.java)
            intent2.putExtra("last_task", application)
            startActivity(intent2)
            finish()
        }

        val stringData = intent.getStringExtra("string_val")
        val intData = intent.getIntExtra("int_val", 0)
        val modelData = intent.getStringExtra("model")

        binding.textView3.text = "Data: $stringData, Int Data: $intData, ModelData: $modelData"


    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("last_task", binding.textView3.text.toString())
        Log.d("Alert", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val textViewText = savedInstanceState.getString("last_task")
        Log.d("Alert", "onRestoreInstanceState")
        binding.textView3.text = textViewText

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}
