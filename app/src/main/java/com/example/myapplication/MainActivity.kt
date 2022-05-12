package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun plusnum(view: View) {
        val countTextView = findViewById<TextView>(R.id.textView)
        val currentnum = Integer.parseInt(countTextView.text.toString())
        countTextView.setText((currentnum+1).toString())
    }

    fun resetnum(view: View) {
        val countTextView = findViewById<TextView>(R.id.textView)
        countTextView.setText("0")
    }
}