package com.example.lab7

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.lab7.Fragment22Args
import com.example.lab7.databinding.Fragment22Binding


class Fragment22 : Fragment() {
    private lateinit var binding: Fragment22Binding
    private val args: Fragment22Args by navArgs()

    private var name = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment22Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = args.name
        binding.textView4.text = "$name"

        binding.button2.setOnClickListener {

            val back = Fragment22Directions.actionFragment22ToFragment11()
            findNavController().navigate(back)
        }
    }
}