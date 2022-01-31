package com.example.statechanges

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "On Create", Toast.LENGTH_SHORT).show()
        val button = findViewById<Button>(R.id.idButton)


        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show()
    }


    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On resume", Toast.LENGTH_SHORT).show()
    }


    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show()
    }


    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show()
    }


    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show()
    }


}

