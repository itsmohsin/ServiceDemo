package com.itsmohsin.servicedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itsmohsin.servicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{

        }

        binding.btnStop.setOnClickListener {

        }
    }
}