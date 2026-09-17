package com.example.aplicativopam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)


        val botao = findViewById<Button>(R.id.btnProxima)
        val texto = findViewById<EditText>(R.id.editValor)



        botao.text = "oi testando o botão"

        botao.setOnClickListener {
            botao.text = texto.text
            }
        }
    }
}