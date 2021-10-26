package com.example.recyclerview_rikzaharisinsyira_31

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarsAdapter(private val context: Context, private val cars: List<Cars>, val listener: (Cars) -> Unit)
    : RecyclerView.Adapter<CarsAdapter.CarsViewHolder>(){

    class CarsViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgCars = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameCars = view.findViewById<TextView>(R.id.tv_item_name)
        val descCars = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(cars: Cars, listener: (Cars) -> Unit){
            imgCars.setImageResource(cars.imgCars)
            nameCars.text = cars.nameCars
            descCars.text = cars.descCars
            itemView.setOnClickListener{
                listener(cars)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        return CarsViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_cars, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.bindView(cars[position], listener)
    }

    override fun getItemCount(): Int = cars.size
    }