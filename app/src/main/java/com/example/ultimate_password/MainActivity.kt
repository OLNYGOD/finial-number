package com.example.ultimate_password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ultimate_password.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
''
    }
}