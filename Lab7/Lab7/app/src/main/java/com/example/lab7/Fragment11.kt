package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab7.databinding.Fragment11Binding
import androidx.navigation.fragment.findNavController


class Fragment11 : Fragment() {

    private lateinit var binding: Fragment11Binding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?,): View? {
        binding=Fragment11Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {

            val name = binding.edit1.text.toString()

            val next = Fragment11Directions.actionFragment11ToFragment22(name)

            findNavController().navigate(next)
        }
    }
}