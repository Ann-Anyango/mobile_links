package com.example.mymeme1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ann3 : AppCompatActivity() {

    lateinit var button2:Button
    lateinit var button7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ann3)
        button2=findViewById(R.id.button2)
        button7=findViewById(R.id.button7)
        button2.setOnClickListener {
            val forward=Intent(this,ann4::class.java)
            startActivity(forward)
        }
        button7.setOnClickListener {
            val forward= Intent(this,anne2::class.java)
            startActivity(forward)
        }

    }
}