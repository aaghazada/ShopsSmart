package com.example.shopssmart.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shopssmart.model.local.ProductModel

@Database(entities = [ProductModel::class], version = 4)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getProductDao(): ProductDao
}