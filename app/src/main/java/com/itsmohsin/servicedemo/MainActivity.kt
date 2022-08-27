package com.itsmohsin.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.itsmohsin.servicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val serviceIntent = Intent(this, MyBackgroundService::class.java)
        serviceIntent.putExtra(MyBackgroundService.NAME,"Alexa")
        serviceIntent.putExtra(MyBackgroundService.MARKS,78)
        binding.btnStart.setOnClickListener{
            Log.i(MyBackgroundService.TAG,"Starting Service")
            startService(serviceIntent)
        }

        binding.btnStop.setOnClickListener {
            Log.i(MyBackgroundService.TAG,"Stopping Service")
            stopService(serviceIntent)

        }
    }
}