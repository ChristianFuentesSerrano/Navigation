package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation.databinding.FragmentInsideHomeBinding

class insideHome : Fragment() {

    private var _binding: FragmentInsideHomeBinding? = null
    private val binding get() = _binding!!

    private val args: insideHomeArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInsideHomeBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = args.registro.toString()

        binding.buttoninsideHometoHome.setOnClickListener {
            val action = insideHomeDirections.actionInsideHomeToHomeFragment()
            findNavController().navigate(action)
        }
    }

}