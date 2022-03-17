package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        //binding = FragmentHomeBinding.inflate(inflater, container, false)

        val navController = findNavController()
        binding.buttonHomeToInside.setOnClickListener{
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val destination = homeFragmentDirections.actionHomeFragmentToInsideHome()//"desde el home")
            navController.navigate(destination)
        }

        return  binding.root
    }

}