package com.felipejose.imagebuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidImagem = findViewById<ImageButton>(R.id.androidImagem) as ImageButton

        androidImagem.setOnClickListener{
            Toast.makeText(this@MainActivity, "Esse aqui é o símbolo do Android Studio", Toast.LENGTH_SHORT).show()
        }
    }
}
