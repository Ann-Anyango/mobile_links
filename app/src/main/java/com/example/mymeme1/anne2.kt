package com.example.mymeme1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class anne2 : AppCompatActivity() {
    lateinit var  button: Button
    lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anne2)
        button=findViewById(R.id.button)
        button6=findViewById(R.id.button6)
        button.setOnClickListener {
            val forward= Intent(this,ann3::class.java)
            startActivity(forward)
        }
        button6.setOnClickListener {
            val forward= Intent(this,MainActivity::class.java)
            startActivity(forward)
        }
    }
}