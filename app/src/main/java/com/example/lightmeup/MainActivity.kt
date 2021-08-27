package com.example.lightmeup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var state = R.drawable.ic_lightbulb_black_24dp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {
            state = when (state) {
                R.drawable.ic_lightbulb_black_24dp -> R.drawable.ic_thumb_up_black_24dp
                R.drawable.ic_thumb_up_black_24dp -> R.drawable.ic_lightbulb_black_24dp
                else -> R.drawable.ic_lightbulb_black_24dp
            }
            imageView.setImageDrawable(getDrawable(state))
        }
    }
}