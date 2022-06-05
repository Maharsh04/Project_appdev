package com.example.daybook_mydailydiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addbutton: Button = findViewById(R.id.addbutton)
        addbutton.setOnClickListener{
            val intent= Intent(this,New_Entry::class.java)
            startActivity(intent)




    }
} }
