package com.example.makanannusantara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detailInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_info)

        val tvDetailName: TextView= findViewById(R.id.tv_detail_name)
        val tvDetailDescription : TextView= findViewById(R.id.tv_detail_description)
        val ivDetailPhoto: ImageView = findViewById(R.id.iv_detail_photo)
        val tvDetailJenis: TextView= findViewById(R.id.tv_detail_jenis)

        val dataFood = intent.getParcelableExtra<Food>("key")

        if (dataFood != null) {
            tvDetailName.text = dataFood.name
        }
        if (dataFood != null) {
            tvDetailDescription.text = dataFood.description
        }
        if (dataFood != null) {
            tvDetailJenis.text = dataFood.jenis
        }
        if (dataFood != null) {
            ivDetailPhoto.setImageResource(dataFood.photo)
        }
    }



}