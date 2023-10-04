package com.example.projectbp2607

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class BookKidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        //instance
        val btnFairy:Button = findViewById(R.id.buttonFairy)
        val btnFable:Button = findViewById(R.id.buttonFable)
        val btnScience:Button = findViewById(R.id.buttonScience)

        //even button fairy
        btnFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }

        //even button fable
        btnFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        //even button science
        btnScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }
    }

    //create method replace fragment
    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}