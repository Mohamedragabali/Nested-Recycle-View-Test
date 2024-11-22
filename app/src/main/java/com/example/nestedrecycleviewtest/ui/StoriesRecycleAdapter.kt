package com.example.nestedrecycleviewtest.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycleviewtest.R
import com.example.nestedrecycleviewtest.databinding.ItemStorieBinding
import com.example.nestedrecycleviewtest.databinding.StoriesRecycleBinding

class StoriesRecycleAdapter (val list: List<String>)
    : RecyclerView.Adapter<StoriesRecycleAdapter.StoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_storie, parent, false)
        return StoryViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.binding.storyName.text = list[position]
    }

    class StoryViewHolder(viewItem: View) : MainActivityAdabter.BaseViewHolder(viewItem) {
        val binding = ItemStorieBinding.bind(viewItem)
    }
}