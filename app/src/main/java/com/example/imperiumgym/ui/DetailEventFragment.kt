package com.example.imperiumgym.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.imperiumgym.R
import com.example.imperiumgym.adapter.EventAdapter
import com.example.imperiumgym.data.model.Detail
import com.example.imperiumgym.databinding.FragmentDetailEventBinding
import com.example.imperiumgym.viewmodel.SharedViewModel

class DetailEventFragment : Fragment() {

    private lateinit var binding: FragmentDetailEventBinding
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailEventBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.zurueck4BTN.setOnClickListener {
            findNavController().navigateUp()
        }

        viewModel.selectedDetail.observe(viewLifecycleOwner) { it ->
            binding.text1TV.text = it.detailListe[0].standort
            binding.text2TV.text = it.detailListe[0].produktbeschreibung
            binding.imageIV.setImageResource(it.detailListe[0].image)

        }
    }
}