package com.yoshi1125hisa.firstkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.yoshi1125hisa.firstkotlin.R.id.textView
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

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

        fun randomMe(view: View){

            val randomIntent = Intent(this, SecondActivity::class.java)
            val showCountTextView = findViewById<TextView>(R.id.textView)
            val countString = showCountTextView.text.toString()
            val count = Integer.parseInt(countString)
            randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
            startActivity(randomIntent)
        }

        fun showRandomNumber() {
            // Get the count from the intent extras
            val count = intent.getIntExtra(TOTAL_COUNT, 0)

            // Generate the random number
            val random = Random()
            var randomInt = 0
            // Add one because the bound is exclusive
            if (count > 0) {
                // Add one because the bound is exclusive
                randomInt = random.nextInt(count + 1)
            }

            // Display the random number.
            findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)

            // Substitute the max value into the string resource
            // for the heading, and update the heading
            findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_heading, count)
        }
    }
}
