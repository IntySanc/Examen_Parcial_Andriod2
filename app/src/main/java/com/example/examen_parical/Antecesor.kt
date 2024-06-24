package com.example.examen_parical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen_parical.databinding.FragmentAntecesorBinding


class Antecesor : Fragment() {
    private lateinit var binding: FragmentAntecesorBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAntecesorBinding.inflate(inflater, container, false)
        start ()
        return binding.root
    }
    private fun start(){
        binding.btnAntecesor.setOnClickListener {
            val num1: Int = binding.tfNum1.editText?.text.toString().toIntOrNull() ?: 0
            val resultado: Int = Antecesor(num1)
            binding.tvResultado.text = resultado.toString()

        }

    }
    private fun Antecesor(num1: Int): Int{
        return num1 - 1

    }
}