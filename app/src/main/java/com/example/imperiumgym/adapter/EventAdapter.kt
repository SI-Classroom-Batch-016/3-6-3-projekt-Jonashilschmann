package com.example.imperiumgym.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imperiumgym.data.model.Detail
import com.example.imperiumgym.data.model.Event
import com.example.imperiumgym.databinding.ListItemBinding

class EventAdapter(

    private val dataset: List<Event>,
    private val onDetailClick: (Event) -> Unit

): RecyclerView.Adapter<EventAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.eventHeadingTV.setText(item.name)
        holder.binding.eventImageIV.setImageResource(item.imageResource)
        holder.binding.uhrzeitTV.setText(item.uhrzeit)

        holder.binding.root.setOnClickListener {
            onDetailClick(item)
        }
    }
}