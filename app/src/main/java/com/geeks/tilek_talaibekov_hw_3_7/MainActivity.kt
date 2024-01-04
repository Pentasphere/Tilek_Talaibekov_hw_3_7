package com.geeks.tilek_talaibekov_hw_3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.tilek_talaibekov_hw_3_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.container, PosterFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_second, PlaylistFragment()).commit()
    }
}