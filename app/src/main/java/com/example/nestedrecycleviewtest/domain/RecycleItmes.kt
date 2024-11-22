package com.example.nestedrecycleviewtest.domain



import com.example.nestedrecycleviewtest.domain.enum.RecycleItemType

sealed class RecycleItmes(val type : RecycleItemType)

data class Story(val allStory : List<String>) : RecycleItmes(RecycleItemType.STORY)

data class Post (val textPost:String ) : RecycleItmes(RecycleItemType.POST)
