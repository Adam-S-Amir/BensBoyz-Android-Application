package com.bensboyz.food

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SingleView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_single_view)
        getSupportActionBar()?.hide()

        val i: Intent? = intent
        val position: Int? = i?.extras?.getInt("id")

        val imageAdapter = ImageAdapter(this)
        val imageView: ImageView = findViewById(R.id.SingleView)
        position?.let {
            imageView.setImageResource(imageAdapter.mThumbIdsandText.getOrNull(it)?.first ?: 0)
        }

        val txtView: TextView = findViewById(R.id.txtView)
        position?.let {
            txtView.text = imageAdapter.mThumbIdsandText.getOrNull(it)?.second
        }
    }



}
