package com.example.shopssmart.model.local

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductModel(
    val id: Int,
    val productId: String,
    val productTitle: String,
    val productImage: Int,
    val price : String,
    val description: String,
    val isFavourite: Boolean = false
): Parcelable