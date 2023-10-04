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

        //even button fairy
        val intentBookKidActivity = Intent(this, BookKidActivity::class.java)
        startActivity(intentBookKidActivity)
    }
}


