package com.bautista.zedric.block2.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber: EditText = findViewById(R.id.insrt_First)
        val secondNumber: EditText = findViewById(R.id.insrt_Second)
    }
}