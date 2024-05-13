package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.lab7.databinding.ActivityMainBinding
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(binding.frame.id) as? NavHostFragment
        navHostFragment?.let { navFragment ->
        val firstFragment = navFragment.childFragmentManager.fragments.firstOrNull() as? Fragment11

        }

        val navHostTopFragment = supportFragmentManager.findFragmentById(binding.frame.id) as? NavHostFragment
        navHostFragment?.let { navFragment ->
            val firstTopFragment = navFragment.childFragmentManager.fragments.firstOrNull() as? FragmentT1

        }

        binding.fragment1Btn.setOnClickListener {
            val Cfragment = CreatedFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame1, Cfragment).addToBackStack(null).commit()
        }
    }
}