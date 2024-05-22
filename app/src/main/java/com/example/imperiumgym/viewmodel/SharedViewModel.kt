package com.example.imperiumgym.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imperiumgym.data.model.Datasource
import com.example.imperiumgym.data.model.Detail
import com.example.imperiumgym.data.model.Event

class SharedViewModel : ViewModel() {

    val allEvents: List<Event> = Datasource.data

    private var _selectedDetail = MutableLiveData<Event>()
    val selectedDetail: LiveData<Event>
        get() = _selectedDetail





    private var _filteredEvents: MutableLiveData<List<Event>> = MutableLiveData(allEvents)

    val filteredEvents: LiveData<List<Event>>
        get() = _filteredEvents


    fun setDetails(details: Event) {
        _selectedDetail.value = details
    }

    fun filterbyEventName (searchTerm: String) {

        val newFilteredEvents = allEvents.filter {
           it.name.lowercase().contains(searchTerm)
        }

        _filteredEvents.value = newFilteredEvents
        Log.d("test2","$_filteredEvents")
    }
}