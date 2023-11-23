package com.example.photosapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.photosapplication.databinding.ActivityMainBinding
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load("https://drive.google.com/uc?id=1WyxFMU2Qnc_zBpSZLHJGkQOSdUgb48l9")
            .into(binding.remoteImgOne)
        Glide.with(this).load("https://drive.google.com/uc?id=16nJMZswp5RwJGilX3LlUoxut_yaZdZdZ")
            .into(binding.remoteImgTwo)
        Glide.with(this).load("https://drive.google.com/uc?id=1CGKF_ZBWbHcP9oFll4hISG2PoX1WaRrr")
            .into(binding.remoteImgThree)
        Glide.with(this).load("https://drive.google.com/uc?id=153t8abVhUdVAi6GscV_LPAwzUwD1p7R6")
            .into(binding.remoteImgFour)
    }
}