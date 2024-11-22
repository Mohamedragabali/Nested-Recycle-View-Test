package com.example.nestedrecycleviewtest.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycleviewtest.R
import com.example.nestedrecycleviewtest.databinding.ItemPostBinding
import com.example.nestedrecycleviewtest.databinding.ItemStorieBinding
import com.example.nestedrecycleviewtest.databinding.StoriesRecycleBinding
import com.example.nestedrecycleviewtest.domain.Post
import com.example.nestedrecycleviewtest.domain.RecycleItmes
import com.example.nestedrecycleviewtest.domain.Story
import com.example.nestedrecycleviewtest.domain.enum.RecycleItemType

class MainActivityAdabter(private val list:List<RecycleItmes>)
    :RecyclerView.Adapter<MainActivityAdabter.BaseViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return  when(viewType ){
            RecycleItemType.STORY.ordinal ->{
                val view = LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.stories_recycle, parent, false)
                return StoryViewHolder(view)
            }
            RecycleItemType.POST.ordinal ->{
                val view = LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.item_post, parent, false)
                return PostViewHolder(view)
            }
            else ->
                super.createViewHolder(parent, viewType)
        }
    }

    override fun getItemCount(): Int  = list.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val currentItme = list[position]
        when(holder){
            is StoryViewHolder ->{
                val adabter = StoriesRecycleAdapter(  (currentItme as Story).allStory )
                holder.binding.storyRecycle.adapter = adabter
            }
            is PostViewHolder ->{
                holder.binding.postName.text = ( currentItme as Post ).textPost
            }
        }
    }

    override fun getItemViewType(position: Int): Int = list[position].type.ordinal


    abstract class BaseViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {}

    class StoryViewHolder(viewItem: View) : BaseViewHolder(viewItem) {
        val binding = StoriesRecycleBinding.bind(viewItem)
    }

    class PostViewHolder(viewItem: View) : BaseViewHolder(viewItem) {
        val binding = ItemPostBinding.bind(viewItem)
    }
}