package com.example.recyclerview_rikzaharisinsyira_31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carsList = listOf<Cars>(
            Cars(
                R.drawable.gt86,
                "Toyota GT86",
                "Sports car (S)"
            ),
            Cars(
                R.drawable.mx5,
                "Mazda MX5",
                "Roadster, sports car (S)"
            ),
            Cars(
                R.drawable.r34,
                "Nissan R34",
                "Sport car"
            ),
            Cars(
                R.drawable.rx7,
                "Mazda RX7",
                "Sports car (S)"
            ),
            Cars(
                R.drawable.supra,
                "Toyota Supra",
                "Sports car/grand tourer (S)"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_cars)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CarsAdapter(this, carsList){
            val intent = Intent (this, DetailCarsActivity2::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}