package com.example.shopssmart.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shopssmart.model.local.ProductModel

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertProduct(productModel: ProductModel)

    @Query("SELECT * FROM product_table")
    fun getAllProducts(): List<ProductModel>
}