package com.example.imperiumgym.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.imperiumgym.R
import com.example.imperiumgym.databinding.FragmentRegisterNameBinding

class RegisterNameFragment : Fragment() {

    private lateinit var binding: FragmentRegisterNameBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterNameBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.weiterBTN.setOnClickListener {
            val name = binding.editNameET.text.toString()

            if (name.isNotBlank()) {
                findNavController().navigate(R.id.registerAdressFragment)
            }
        }

        binding.zurueckBTN.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}