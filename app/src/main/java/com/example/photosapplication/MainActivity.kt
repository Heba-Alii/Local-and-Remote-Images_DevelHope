package com.example.photosapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.photosapplication.databinding.ActivityMainBinding
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var imageOneDisplayed = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.imageOne.setOnClickListener {
//            if (imageOneDisplayed) {
//                binding.imageOne.setImageResource(R.drawable.imagefour)
//            } else {
//                binding.imageOne.setImageResource(R.drawable.imagethree)
//
//            }
//            imageOneDisplayed = !imageOneDisplayed
//        }

    }
}