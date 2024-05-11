package com.example.lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lab6.databinding.ActivityPage3Binding

private const val TAG = "## Activity C"

class Page3 : AppCompatActivity() {

    private lateinit var binding:ActivityPage3Binding
    private var application: Application? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        application = intent.getParcelableExtra("last_task");
        application?.let{
            val bookInfo = "Title: ${it.name}, Day ${it.day}, Month ${it.month}, Owner: ${it.owner}"
            binding.textView4.text = bookInfo
        }


        binding.button3.setOnClickListener {
            val intent3 = Intent(this, MainActivity::class.java)
            startActivity(intent3)
            finish()
        }


        Log.d(TAG, "onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("last_task", application)
        Log.d("Alert", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        application = savedInstanceState.getParcelable("last_task")

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