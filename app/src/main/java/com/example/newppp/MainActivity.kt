package com.example.newppp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textData = findViewById<TextView>(R.id.textviewId)
        var plainText = findViewById<EditText>(R.id.edittextId)
        val btn = findViewById<Button>(R.id.button)
        val offerBtn = findViewById<Button>(R.id.button2)
        var enterName = " "
        btn.setOnClickListener{
            offerBtn.visibility = View.INVISIBLE
             enterName = plainText.text.toString()
            if(enterName == ""){
                Toast.makeText(this, "please enter your name", Toast.LENGTH_LONG).show()
            }else{

                val msg = "Welcome $enterName"
                textData.text = msg
                plainText.text.clear()
                offerBtn.visibility = View.VISIBLE
            }
        }

        offerBtn.setOnClickListener(){
            val intent = Intent(this,SecondActivity2::class.java)
            intent.putExtra("USER",enterName)
            startActivity(intent)
        }
    }
}