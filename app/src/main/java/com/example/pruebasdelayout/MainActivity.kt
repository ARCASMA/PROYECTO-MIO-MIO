package com.example.pruebasdelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.pruebasdelayout.R.id.textView2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1: EditText = findViewById(R.id.editTextText2)
        val num2: EditText = findViewById(R.id.editTextText3)
        val btnsumar: Button = findViewById(R.id.button)
        val btnrestar: Button = findViewById(R.id.button2)
        val txtRes: TextView = findViewById(R.id.textView2)

        btnsumar.setOnClickListener {
            val numero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            val suma = numero1 + numero2
            txtRes.text = suma.toString()
        }
        btnrestar.setOnClickListener {
            val numero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            val suma = numero1 - numero2
            txtRes.text = suma.toString()
        }
    }
}