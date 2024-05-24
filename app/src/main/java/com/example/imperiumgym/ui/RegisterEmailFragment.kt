package com.example.imperiumgym.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.imperiumgym.databinding.FragmentRegisterEmailBinding

class RegisterEmailFragment : Fragment() {

    private lateinit var binding: FragmentRegisterEmailBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterEmailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.weiter3BTN.setOnClickListener {
            val email = binding.emailET.text

           if (email!!.isNotBlank()) {
               findNavController().navigate(
                   RegisterEmailFragmentDirections.actionRegisterEmailFragment2ToRegisterPasswordFragment()
               )
            }
        }


    }
}