package com.example.projectbp2607

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance
        val btnMenu1:Button = findViewById(R.id.buttonMenu1)
        val btnMenu4:Button = findViewById(R.id.buttonMenu4)

        //even button fairy
        btnMenu1.setOnClickListener {
            val intentBookKidActivity = Intent(this, BookKidActivity::class.java)
            startActivity(intentBookKidActivity)
        }

        btnMenu4.setOnClickListener {
            val intentAboutActivity = Intent(this, AboutActivity::class.java)
            startActivity(intentAboutActivity)
        }
    }
}


