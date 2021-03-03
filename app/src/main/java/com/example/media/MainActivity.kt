package com.example.media

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = calcular
        val resultado = resultado //TextView

        btnCalcular.setOnClickListener {
            val nota1: Int = Integer.parseInt(nota1.text.toString())
            val nota2: Int = Integer.parseInt(nota2.text.toString())
            val media: Int = (nota1 + nota2)/2
            val faltas: Int = Integer.parseInt(faltas.text.toString())


            if(media >= 6 && faltas <= 10 || media < 6 && faltas < 10){
                resultado.setText("Aluno aprovado\nNota final: $media\nfaltas: $faltas")
                resultado.setTextColor(Color.GREEN)

            }else {
                resultado.setText("Aluno reprovado\nNota final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}