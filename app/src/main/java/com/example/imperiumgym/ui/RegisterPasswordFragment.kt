package com.example.imperiumgym.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.imperiumgym.databinding.FragmentRegisterPasswordBinding


class RegisterPasswordFragment : Fragment() {


    private lateinit var binding: FragmentRegisterPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterPasswordBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.registrieren2BTN.setOnClickListener {
            val passwort1 = binding.passwortET.text.toString()
            val passwort2 = binding.passwortWiET.text.toString()

            if (passwort1 == passwort2) {

                findNavController().navigate(RegisterPasswordFragmentDirections.actionRegisterPasswordFragmentToHomeFragment()
                )
            }
        }
    }


}