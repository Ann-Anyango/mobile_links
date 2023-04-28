package com.example.mymeme1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button5=findViewById(R.id.button5)
        button5.setOnClickListener {
            val forward= Intent(this,anne2::class.java)
            startActivity(forward)
        }
    }
}