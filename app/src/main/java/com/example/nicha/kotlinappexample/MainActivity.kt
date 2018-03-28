package com.example.nicha.kotlinappexample

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Since id can never be the same,
        Kotlin knows that "button" can only mean a View that has id "button"
         */
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v==button){
            //when in Kotlin is switch case in Java
            when(radioGroup.checkedRadioButtonId){
                R.id.radioButton1 -> textView.setTextColor(Color.BLACK)
                R.id.radioButton2 -> textView.setTextColor(Color.RED)
                R.id.radioButton3 -> textView.setTextColor(Color.BLUE)
            }
        }
        textView.text = editText.text.toString()
        editText.setText("")
    }
}
