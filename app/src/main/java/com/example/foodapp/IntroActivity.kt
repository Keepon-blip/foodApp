package com.example.foodapp

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondsDelayed = 1
        Handler().postDelayed({
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
            finish()
        }, (secondsDelayed * 1400).toLong())
    }



}