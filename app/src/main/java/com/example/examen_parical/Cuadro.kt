package com.example.examen_parical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen_parical.databinding.FragmentCuadroBinding

class Cuadro : Fragment() {

   private lateinit var binding: FragmentCuadroBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCuadroBinding.inflate(inflater,container,  false )

        start()
        return binding.root
    }

private fun start(){
    binding.btnCuadrado.setOnClickListener{

        val num1: Int = binding.tfNum1.editText?.text.toString().toIntOrNull() ?: 0
        val resultado: Int = cuadrado (num1)
        binding.Resultado.text = resultado.toString()
    }

        }

    private fun cuadrado(num1: Int): Int {
        return num1 * num1

    }

}

