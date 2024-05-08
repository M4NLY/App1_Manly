package com.example.my18thapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView=findViewById<TextView>(R.id.textView)
        val textView1=findViewById<TextView>(R.id.textView2)
        val textView2=findViewById<TextView>(R.id.textView3)
        val button=findViewById<Button>(R.id.button)

        val animation = AnimationUtils.loadAnimation(this, R.anim.anim1)
        textView.startAnimation(animation)

        val animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        textView1.startAnimation(animation2)

        val animation3 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        textView2.startAnimation(animation3)

        val animation4 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        button.setOnClickListener {
            button.startAnimation(animation4)
        }


        }
    }