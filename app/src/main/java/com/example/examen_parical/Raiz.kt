package com.example.examen_parical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen_parical.databinding.FragmentCuadroBinding
import com.example.examen_parical.databinding.FragmentRaizBinding

class Raiz : Fragment() {
    private lateinit var binding: FragmentRaizBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRaizBinding.inflate(inflater, container, false)
        start()
        return binding.root
    }

private fun start() {
    binding.btnraiz.setOnClickListener {
        val num1: Double = binding.tfNum1.editText?.text.toString().toDouble()

        val resultado: Double = raiz(num1)
        binding.tvResultado.text = resultado.toString()

        }
    }

    private fun raiz(num1: Double): Double {
        return kotlin.math.sqrt(num1)

    }
    }





