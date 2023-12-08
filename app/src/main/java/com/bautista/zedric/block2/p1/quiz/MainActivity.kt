package com.bautista.zedric.block2.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber: EditText = findViewById(R.id.insrt_First)
        val secondNumber: EditText = findViewById(R.id.insrt_Second)
        val btnMultiply: Button = findViewById(R.id.btn_Multiply)
        val txtNumber: TextView = findViewById(R.id.txt_Number)

        txtNumber.text = ("ey! ").toString()


        btnMultiply.setOnClickListener {
            txtNumber.text = (firstNumber.text.toString().toInt()*secondNumber.text.toString().toInt()).toString()

        }




    }
}