package com.example.shopssmart.model.local

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "product_table")
data class ProductModel(
    @PrimaryKey

    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "productId")
    val productId: String,

    @ColumnInfo(name = "productTitle")
    val productTitle: String,

    @ColumnInfo(name = "productImage")
    val productImage: String,

    @ColumnInfo(name = "productPrice")
    val price: String,

    @ColumnInfo(name = "productCategoryId")
    val productCategoryId: Int? = null,

    @ColumnInfo(name = "productDescription")
    val description: String,

    @ColumnInfo(name = "isFavorite")
    val isFavourite: Boolean = false

) : Parcelable {
    constructor() : this(
        0,
        "",
        "",
        "",
        "",
        null,
        "",
        false
    )
}
