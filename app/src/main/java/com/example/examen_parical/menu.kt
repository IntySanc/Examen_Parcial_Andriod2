package com.example.examen_parical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.examen_parical.databinding.FragmentCuadroBinding
import com.example.examen_parical.databinding.FragmentMenuBinding
import kotlin.concurrent.fixedRateTimer


class menu : Fragment() {
    lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(layoutInflater)
        binding.btnCuadrado.setOnClickListener {
            findNavController().navigate(R.id.go_cuadrado)
        }

        binding.btnraiz.setOnClickListener {
            findNavController().navigate(R.id.go_raiz)
        }

      binding.btnAntecesor.setOnClickListener {
          findNavController().navigate(R.id.go_antecesor)
      }

        binding.btnelevadoCubo.setOnClickListener {
            findNavController().navigate(R.id.go_elevadoCubo)
        }
        return binding.root
        }

}


