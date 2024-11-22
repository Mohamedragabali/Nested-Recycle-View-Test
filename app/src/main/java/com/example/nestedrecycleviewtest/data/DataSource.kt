package com.example.nestedrecycleviewtest.data

import com.example.nestedrecycleviewtest.domain.Post
import com.example.nestedrecycleviewtest.domain.RecycleItmes
import com.example.nestedrecycleviewtest.domain.Story

object DataSource {

    fun getAllItem(): List<RecycleItmes> {
        return listOf(
            Story(listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")),
            Post("post 1 "),
            Post("post 2 "),
            Post("post 3 "),
            Post("post 4 "),
            Post("post 5 "),
            Post("post 6 "),
            Post("post 7 "),
            Post("post 8 "),
            Post("post 9 "),
            Post("post 10 "),
        )
    }
}