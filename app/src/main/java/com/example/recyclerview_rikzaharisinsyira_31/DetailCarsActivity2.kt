package com.example.recyclerview_rikzaharisinsyira_31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCarsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_cars2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val cars = intent.getParcelableExtra<Cars>(MainActivity.INTENT_PARCELABLE)

        val imgCars = findViewById<ImageView>(R.id.img_item_photo)
        val nameCars = findViewById<TextView>(R.id.tv_item_name)
        val descCars = findViewById<TextView>(R.id.tv_item_description)

        imgCars.setImageResource(cars?.imgCars!!)
        nameCars.text = cars.nameCars
        descCars.text = cars.descCars

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}