package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab7.databinding.FragmentT1Binding


class FragmentT1 : Fragment() {
    private lateinit var binding: FragmentT1Binding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?,): View? {
        binding = FragmentT1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button3.setOnClickListener {
            val next = FragmentT1Directions.actionFragmentT1ToFragmentT2()
            findNavController().navigate(next)
        }
    }
}

//Fragment22Directions.actionFragment22ToFragment11()