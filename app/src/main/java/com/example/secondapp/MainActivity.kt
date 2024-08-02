package com.example.secondapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var nameedittext: EditText
    lateinit var mainTextView: TextView
    var TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameedittext=findViewById((R.id.editTextText))
        mainTextView=findViewById(R.id.textView)
        Log.i(TAG,"im main oncreate")

    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"im main onstart")
    }

    fun clickHandler(view: View) {
        var data= nameedittext.text.toString()

        mainTextView.setText(data)
        var homeIntention = Intent(this,HomeActivity::class.java)
        homeIntention.putExtra("akey",data)
        Log.v(TAG,"im main clickHandler")
        add(10,20)
        startActivity(homeIntention)
        throw NullPointerException("demo crash")
    }

    private fun add(i: Int, i1: Int) {

        var c = i + i1
        var d = c * i + 10
    }

        fun launchHome(view: View) {
        var myIntent = Intent(this,HomeActivity::class.java)
        startActivity(myIntent)
        Log.w(TAG,"im main launchHome")

    }

    fun startDialer(view: View) {
        var dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9876543"))
        startActivity(dialIntent)
    }

    fun setAlarm(view: View) {
        createAlarm("ascendion",17,14)
    }
    fun createAlarm(message: String, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        }
        /// if (intent.resolveActivity(packageManager) != null) { checking if alarm clock exist on the ph
        startActivity(intent)
        //}
    }


}