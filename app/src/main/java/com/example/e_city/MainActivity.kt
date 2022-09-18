package com.example.e_city

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var clickbtn = findViewById<ConstraintLayout>(R.id.clickbtn)
        clickbtn.setOnClickListener {
            var intent = Intent( )
        }

    }
}