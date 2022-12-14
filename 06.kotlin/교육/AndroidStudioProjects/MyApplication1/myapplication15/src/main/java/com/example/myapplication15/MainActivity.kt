package com.example.myapplication15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.button.visibility = View.INVISIBLE
            binding.imageView2.visibility = View.VISIBLE
        }

        binding.imageView2.setOnClickListener {
            binding.button.visibility = View.VISIBLE
            binding.imageView2.visibility = View.INVISIBLE
        }
    }


}