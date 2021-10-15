package com.example.ultimate_password

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ultimate_password.databinding.ActivityGuessBinding
import com.example.ultimate_password.databinding.ActivityMainBinding

class GuessActivity : AppCompatActivity( ) {
    private lateinit var binding : ActivityGuessBinding
    private lateinit var _binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
    }
}