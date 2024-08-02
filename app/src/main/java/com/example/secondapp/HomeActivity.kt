package com.example.secondapp

import android.util.Log
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    var TAG="HomeActivity"
    lateinit var homeTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG,"im home oncreate")
        homeTextView = findViewById(R.id.tvHome)
        var dataReceived = intent.getStringExtra("akey")
        homeTextView.setText(dataReceived)

    }
}