package com.example.recyclerview_rikzaharisinsyira_31

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cars(
    val imgCars: Int,
    val nameCars: String,
    val descCars: String
) : Parcelable