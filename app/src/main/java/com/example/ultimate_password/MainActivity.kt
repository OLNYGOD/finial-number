package com.example.ultimate_password

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.ultimate_password.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun enter(){
        AlertDialog.Builder(this)
            .setPositiveButton(null,{_, _->
                val intent = Intent(this,GuessActivity::class.java)
                startActivity(intent)
            } )
    }
}