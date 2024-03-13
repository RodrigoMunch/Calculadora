package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById(R.id.input01) as EditText
        val num2 = findViewById(R.id.input02) as EditText
        val resultado = findViewById(R.id.resultado) as EditText
        val btSoma = findViewById(R.id.btSoma) as Button
        val btSubtrair = findViewById(R.id.btSubtrair) as Button
        val btMultiplicar = findViewById(R.id.btMultiplicar) as Button
        val btDivisao = findViewById(R.id.btDivisao) as Button

        btSoma.setOnClickListener {
            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            val soma = n1 + n2
            resultado.setText(soma.toString())
        }

        btSubtrair.setOnClickListener {
            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            val subtrair = n1 - n2
            resultado.setText(subtrair.toString())
        }

        btMultiplicar.setOnClickListener {
            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            val multiplicar = n1 * n2
            resultado.setText(multiplicar.toString())
        }

        btDivisao.setOnClickListener {
            val n1 = num1.text.toString().toFloat()
            val n2 = num2.text.toString().toFloat()
            val divisao = n1 / n2
            resultado.setText(divisao.toString())
        }






    }
}

