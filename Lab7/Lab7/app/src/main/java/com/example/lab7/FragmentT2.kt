package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab7.databinding.FragmentT1Binding
import com.example.lab7.databinding.FragmentT2Binding


class FragmentT2 : Fragment() {
    private lateinit var binding: FragmentT2Binding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?,): View? {
        binding = FragmentT2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button4.setOnClickListener {
            val back = FragmentT2Directions.actionFragmentT2ToFragmentT1()
            findNavController().navigate(back)
        }
    }
}