package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab7.databinding.FragmentCreatedBinding


class CreatedFragment : Fragment() {

    private lateinit var binding: FragmentCreatedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreatedBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}