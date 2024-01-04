package com.geeks.tilek_talaibekov_hw_3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.tilek_talaibekov_hw_3_7.databinding.ActivityEmptyBinding

class EmptyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmptyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmptyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.tvMusicName.text = name
    }
}