package com.example.mymeme1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ann4 : AppCompatActivity() {
    lateinit var  button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ann3)
        button3=findViewById(R.id.button2)
        button3.setOnClickListener {
            val forward= Intent(this,meme5::class.java)
            startActivity(forward)
        }
    }
}