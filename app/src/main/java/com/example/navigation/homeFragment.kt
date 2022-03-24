package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonHomeToInside.setOnClickListener {
            registrar()
        }
    }

    private fun registrar(){
        val nombre = binding.nombre.text.toString()
        val apellidoPaterno = binding.apellidoPaterno.text.toString()
        val apellidoMaterno = binding.apellidoMaterno.text.toString()
        val nombreUsuario = binding.nombreUsuario.text.toString()
        val correo = binding.correo.text.toString()

        val registro = Registro(nombre, apellidoPaterno, apellidoMaterno, nombreUsuario, correo)

        val action = homeFragmentDirections.actionHomeFragmentToInsideHome(registro)
        findNavController().navigate(action)
    }

}