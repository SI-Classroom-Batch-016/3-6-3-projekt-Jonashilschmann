package com.example.imperiumgym.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.imperiumgym.R
import com.example.imperiumgym.databinding.FragmentRegisterAdressBinding

class RegisterAdressFragment : Fragment() {

    private lateinit var binding: FragmentRegisterAdressBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterAdressBinding.inflate(layoutInflater)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.weiter2BTN.setOnClickListener {
            val straseHaus = binding.strasehausET.text.toString()
            val postleitzahl = binding.postleitzahlET.text.toString()
            val ort = binding.ortET.text.toString()

            if(straseHaus.isNotBlank() && postleitzahl.isNotBlank() && ort.isNotBlank()) {
                findNavController().navigate(R.id.registerEmailFragment)
            }
        }

        binding.zurueck2BTN.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}