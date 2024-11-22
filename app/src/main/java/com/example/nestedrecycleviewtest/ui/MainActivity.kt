package com.example.nestedrecycleviewtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nestedrecycleviewtest.R
import com.example.nestedrecycleviewtest.data.DataSource
import com.example.nestedrecycleviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adabter = MainActivityAdabter(DataSource.getAllItem())
        binding.mainRecycle.adapter = adabter
    }
}