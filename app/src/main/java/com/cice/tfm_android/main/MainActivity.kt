package com.cice.tfm_android.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cice.tfm_android.databinding.ActivityMainBinding
import com.cice.tfm_android.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {

    // region - Global Variables
    private lateinit var binding: ActivityMainBinding
    // endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}