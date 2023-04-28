package com.example.mymeme1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme5 : AppCompatActivity() {
    lateinit var  button4: Button
    lateinit var  button7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        button4=findViewById(R.id.button4)
        button7=findViewById(R.id.button4)
        button4.setOnClickListener {
            val forward= Intent(this,MainActivity::class.java)
            startActivity(forward)
        }
        button7.setOnClickListener {
            val forward= Intent(this,MainActivity::class.java)
            startActivity(forward)
        }
    }
}