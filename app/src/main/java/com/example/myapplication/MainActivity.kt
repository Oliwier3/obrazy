package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.przycisk)
        val tekstview = findViewById<TextView>(R.id.tekst)
        button.setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ciasto2)
            tekstview.isVisible = true
        }
    }
}