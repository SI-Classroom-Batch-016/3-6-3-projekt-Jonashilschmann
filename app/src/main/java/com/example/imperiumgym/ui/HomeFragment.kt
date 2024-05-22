package com.example.imperiumgym.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.imperiumgym.R
import com.example.imperiumgym.adapter.EventAdapter
import com.example.imperiumgym.data.model.Datasource
import com.example.imperiumgym.data.model.Event
import com.example.imperiumgym.databinding.FragmentHomeBinding
import com.example.imperiumgym.viewmodel.SharedViewModel

class HomeFragment : Fragment() {

    private val args: HomeFragmentArgs by navArgs()
    private lateinit var binding: FragmentHomeBinding
    private val viewModel: SharedViewModel by activityViewModels ()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.editText2ET.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                viewModel.filterbyEventName(s.toString())
                Log.d("textChanged",s.toString())
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        val onDataClick: (Event) -> Unit = {
            viewModel.setDetails(it)
            findNavController().navigate(R.id.action_homeFragment_to_detailEventFragment)
        }

        viewModel.filteredEvents.observe(viewLifecycleOwner) {

            binding.eventRV.adapter = EventAdapter(it, onDataClick)
        }


        val data = Datasource.data
        val adapter = EventAdapter(data, onDataClick)
        binding.eventRV.adapter = adapter

        binding.emailAnzeigeTV.text = args.email
    }
}