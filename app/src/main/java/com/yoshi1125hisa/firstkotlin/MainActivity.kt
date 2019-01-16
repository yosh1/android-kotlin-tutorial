package com.yoshi1125hisa.firstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun countMe(view: View){
            val showCountTextView = findViewById<TextView>(R.id.textView)
            val countStr = showCountTextView.text.toString()

            var count: Int = Integer.parseInt(countStr)
            count++

            showCountTextView.text = count.toString()
        }
        fun toastMe(view: View){
            val myToast = Toast.makeText(this,"Hello, World!",Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}
