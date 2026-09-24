package com.example.aplicativopam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicios)


        val etNumeroDobro = findViewById<EditText>(R.id.etNumeroDobro)
        val btnCalcularDobro = findViewById<Button>(R.id.btnCalcularDobro)
        val tvResultadoDobro = findViewById<TextView>(R.id.tvResultadoDobro)

        btnCalcularDobro.setOnClickListener {
            val texto = etNumeroDobro.text.toString()
            if (texto.isNotEmpty()) {
                val numero = texto.toInt()
                val dobro = numero * 2
                tvResultadoDobro.text = "Resultado: $dobro"
            } else {
                tvResultadoDobro.text = "Resultado: Digite um número."
            }
        }


        val etIdadeDias = findViewById<EditText>(R.id.etIdadeDias)
        val btnCalcularDias = findViewById<Button>(R.id.btnCalcularDias)
        val tvResultadoDias = findViewById<TextView>(R.id.tvResultadoDias)

        btnCalcularDias.setOnClickListener {
            val texto = etIdadeDias.text.toString()
            if (texto.isNotEmpty()) {
                val idade = texto.toInt()
                val dias = idade * 365
                tvResultadoDias.text = "Você já viveu aproximadamente $dias dias"
            } else {
                tvResultadoDias.text = "Resultado: Digite a idade."
            }
        }


        val etValorConta = findViewById<EditText>(R.id.etValorConta)
        val btnCalcularGorjeta = findViewById<Button>(R.id.btnCalcularGorjeta)
        val tvResultadoGorjeta = findViewById<TextView>(R.id.tvResultadoGorjeta)

        btnCalcularGorjeta.setOnClickListener {
            val texto = etValorConta.text.toString()
            if (texto.isNotEmpty()) {
                val conta = texto.toDouble()
                val gorjeta = conta * 0.10
                tvResultadoGorjeta.text = "Resultado: R$ ${String.format(Locale.US, "%.2f", gorjeta)}"
            } else {
                tvResultadoGorjeta.text = "Resultado: Digite o valor."
            }
        }


        val etValorDolar = findViewById<EditText>(R.id.etValorDolar)
        val btnConverterMoeda = findViewById<Button>(R.id.btnConverterMoeda)
        val tvResultadoMoeda = findViewById<TextView>(R.id.tvResultadoMoeda)

        btnConverterMoeda.setOnClickListener {
            val texto = etValorDolar.text.toString()
            if (texto.isNotEmpty()) {
                val dolar = texto.toDouble()
                val real = dolar * 5.50
                tvResultadoMoeda.text = "Resultado: R$ ${String.format(Locale.US, "%.2f", real)}"
            } else {
                tvResultadoMoeda.text = "Resultado: Digite o valor em dólares."
            }
        }


        val etNota1 = findViewById<EditText>(R.id.etNota1)
        val etNota2 = findViewById<EditText>(R.id.etNota2)
        val btnCalcularMedia = findViewById<Button>(R.id.btnCalcularMedia)
        val tvResultadoMedia = findViewById<TextView>(R.id.tvResultadoMedia)

        btnCalcularMedia.setOnClickListener {
            val textoNota1 = etNota1.text.toString()
            val textoNota2 = etNota2.text.toString()
            if (textoNota1.isNotEmpty() && textoNota2.isNotEmpty()) {
                val nota1 = textoNota1.toDouble()
                val nota2 = textoNota2.toDouble()
                val media = (nota1 + nota2) / 2.0
                tvResultadoMedia.text = "Resultado: ${String.format(Locale.US, "%.2f", media)}"
            } else {
                tvResultadoMedia.text = "Resultado: Preencha ambas as notas."
            }
        }


        val etIdadeCategoria = findViewById<EditText>(R.id.etIdadeCategoria)
        val btnClassificarIdade = findViewById<Button>(R.id.btnClassificarIdade)
        val tvResultadoCategoria = findViewById<TextView>(R.id.tvResultadoCategoria)

        btnClassificarIdade.setOnClickListener {
            val texto = etIdadeCategoria.text.toString()
            if (texto.isNotEmpty()) {
                val idade = texto.toInt()
                val categoria = if (idade < 12) {
                    "Criança"
                } else if (idade in 12..17) {
                    "Adolescente"
                } else if (idade in 18..59) {
                    "Adulto"
                } else {
                    "Idoso"
                }
                tvResultadoCategoria.text = "Resultado: $categoria"
            } else {
                tvResultadoCategoria.text = "Resultado: Digite a idade."
            }
        }


        val etValorCompra = findViewById<EditText>(R.id.etValorCompra)
        val btnCalcularDesconto = findViewById<Button>(R.id.btnCalcularDesconto)
        val tvResultadoDesconto = findViewById<TextView>(R.id.tvResultadoDesconto)

        btnCalcularDesconto.setOnClickListener {
            val texto = etValorCompra.text.toString()
            if (texto.isNotEmpty()) {
                val valorCompra = texto.toDouble()

                val descontoPercentual: Int
                val valorFinal: Double

                if (valorCompra < 100.0) {
                    descontoPercentual = 0
                    valorFinal = valorCompra
                } else if (valorCompra < 300.0) {
                    descontoPercentual = 5
                    valorFinal = valorCompra * 0.95
                } else if (valorCompra < 500.0) {
                    descontoPercentual = 10
                    valorFinal = valorCompra * 0.90
                } else {
                    descontoPercentual = 15
                    valorFinal = valorCompra * 0.85
                }

                tvResultadoDesconto.text = "Desconto: $descontoPercentual% | Total: R$ ${String.format(Locale.US, "%.2f", valorFinal)}"
            } else {
                tvResultadoDesconto.text = "Resultado: Digite o valor da compra."
            }
        }
    }
}