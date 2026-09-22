package com.example.aplicativopam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora_imc)

        val editPeso = findViewById<EditText>(R.id.editPeso) // Peso
        val editAltura = findViewById<EditText>(R.id.editAltura) // Altura
        val Resultado = findViewById<TextView>(R.id.txtResultado)
        val IMC = findViewById<Button>(R.id.btnCalcular)


        IMC.setOnClickListener {

            val imc =((editAltura.text.toString().toFloat() * editAltura.text.toString().toFloat())/editPeso.text.toString().toFloat())

            Resultado.text ="O IMC é:" + imc


        }
    }
}