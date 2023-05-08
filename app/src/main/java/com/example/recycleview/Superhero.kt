package com.example.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class Superhero (
    val imgSuperhero : Int,
    val nameSuperhero : String,
    val descSuperhero : String
) : Parcelable