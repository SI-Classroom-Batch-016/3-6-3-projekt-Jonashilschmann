package com.example.imperiumgym.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.imperiumgym.R
import com.example.imperiumgym.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.LoginBTN.setOnClickListener {
            val email2 = binding.email2ET.text
            val passwort2 = binding.passwort2ET.text

            if (email2 != null && passwort2 != null) {
                if (email2.isNotBlank() && passwort2.isNotBlank()) {
                    findNavController().navigate(
                        LoginFragmentDirections.actionLoginFragmentToHomeFragment()
                    )
                }
            }
        }

        binding.zurCk3BTN.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}