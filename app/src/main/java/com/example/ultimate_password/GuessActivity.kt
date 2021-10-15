package com.example.ultimate_password

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.ultimate_password.databinding.ActivityGuessBinding
import com.example.ultimate_password.databinding.ActivityMainBinding

class GuessActivity : AppCompatActivity( ) {
    private lateinit var binding : ActivityGuessBinding
    private lateinit var _binding : ActivityMainBinding
    val TAG = GuessActivity::class.java.simpleName
    val sercrtNumber = SercrtNumber(_binding.edSecretNumber.text.toString().toInt() , _binding.edPlayerNumber.text.toString().toInt())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
    }
    fun check(){
        val number = binding.edNumber.toString().toInt()
        Log.d(TAG, "enter_number : " + number)
        var diff = sercrtNumber.validate(number)
        var message = "You get it"
        if (diff > 0) {
            message = "bigger"
        } else if (diff < 0) {
            message = "smaller"
        }else if (diff == 0){
            message = "excellent_number_is "+ sercrtNumber.sercrt
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        AlertDialog.Builder(this)
            .setTitle("Message")
            .setMessage(message)
            .setPositiveButton("ok", null) //按鈕按下執行
            .show()
    }
}

