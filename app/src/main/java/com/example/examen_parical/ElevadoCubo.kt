package com.example.examen_parical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen_parical.databinding.FragmentElevadoCuboBinding


class ElevadoCubo : Fragment() {
    private lateinit var binding: FragmentElevadoCuboBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentElevadoCuboBinding.inflate(inflater, container, false)
        start ()
        return binding.root
    }
        private fun start () {
            binding.btnelevadoCubo.setOnClickListener {
                val num1: Int = binding.tfNum1.editText?.text.toString().toInt()
                val resultado: Int = elevadocubo(num1)
                val resultadocubo: Int = resultadocubo(resultado)
                binding.tvResultado.text = "El Sucesor es: $resultado\n Y su Cubo es: $resultadocubo"
            }
        }
            private fun elevadocubo (num1: Int): Int{
                return num1 + 1

            }
            private fun resultadocubo (elevadocubo: Int): Int {
            return Math.pow(elevadocubo.toDouble(),3.0).toInt()
    }

}

