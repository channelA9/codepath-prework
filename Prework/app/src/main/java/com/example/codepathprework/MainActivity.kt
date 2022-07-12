package com.example.codepathprework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // values and variables
        val bg = findViewById<ConstraintLayout>(R.id.bg)
        val textView = findViewById<TextView>(R.id.textView)
        val txtColorButton = findViewById<Button>(R.id.txtColorButton)
        val bgColorButton = findViewById<Button>(R.id.bgColorButton)
        val txtAndroidButton = findViewById<Button>(R.id.txtAndroidButton)
        val txtButton = findViewById<Button>(R.id.txtButton)
        val rstButton = findViewById<Button>(R.id.rstButton)
        val editText = findViewById<EditText>(R.id.editText)

        var sToggle = false

        // initial disappear
        editText.visibility = android.view.View.GONE

        txtColorButton.setOnClickListener {
            Log.i("Utility", "txt")

            // Locates text id and changes its color
            textView.setTextColor(getResources().getColor(R.color.teal_200))

            // changes editText color for consistency
            editText.setTextColor(getResources().getColor(R.color.teal_200))
        }

        bgColorButton.setOnClickListener {
            Log.i("Utility", "bg")

            // Locates bg id and changes its color
            bg.setBackgroundColor(getResources().getColor(R.color.black))
        }

        txtAndroidButton.setOnClickListener {
            Log.i("Utility", "txt")

            // Locates bg id and changes its color
            textView.text  = "Android is awesome!"

        }

        rstButton.setOnClickListener {
            Log.i("Utility", "all")

            // text and background reset
            textView.text  = "Hello from Shaun!"
            textView.setTextColor(getResources().getColor(R.color.white))
            bg.setBackgroundColor(getResources().getColor(R.color.purple_200))

            // editString reset
            sToggle = false
            editText.visibility = android.view.View.VISIBLE
            editText.setTextColor(getResources().getColor(R.color.white))
            txtButton.text  = "Submit Text"
        }

        txtButton.setOnClickListener {
            Log.i("Utility", "txt")

            // Determines whether or not the editText is visible
            if(!sToggle) {

                editText.visibility = android.view.View.VISIBLE
                txtButton.text  = "Submit Text"

                // clears editText
                editText.text.clear()

                sToggle = true

            } else {
                editText.visibility = android.view.View.GONE
                txtButton.text  = "Edit Text Label"

                // logic to determine whether or not editText is empty, adjusts text string accordingly
                if(editText.text.isNotEmpty()) {
                    textView.text = editText.text
                } else {
                    textView.text = "Hello from Shaun!"
                }

                sToggle = false
            }

        }

    }
}