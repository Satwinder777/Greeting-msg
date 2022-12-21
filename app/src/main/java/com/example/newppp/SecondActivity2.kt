package com.example.newppp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.textView2)
        val msg = "$userName, Your Plan is currently Working....."
        textView.text =msg
    }
}