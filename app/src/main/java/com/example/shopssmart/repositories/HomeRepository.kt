package com.example.shopssmart.repositories

import android.util.Log
import com.example.shopssmart.db.ProductDao
import com.example.shopssmart.model.local.ProductModel
import com.example.shopssmart.util.FirebaseReferenceName.PRODUCT_REFERENCE_NAME
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val productDao: ProductDao
) {

    fun getNewAddedProduct() {
        val productRef = firebaseDatabase.getReference(PRODUCT_REFERENCE_NAME)

        productRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val product = snapshot.getValue(ProductModel::class.java)
                // dao.insertProduct(product)

                Log.i("FirebaseDataChange", "onCancelled: ${product.toString()}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.i("FirebaseError", "onCancelled: ${error.toString()}")
            }

        })
    }

    suspend fun insertNewProduct(productModel: ProductModel) = withContext(Dispatchers.IO) {
        productDao.insertProduct(productModel)
    }

    fun addNewProduct(productModel: ProductModel) {
        val productRef = firebaseDatabase.getReference(PRODUCT_REFERENCE_NAME)

        productRef.setValue(productModel)
    }

    fun getAllProducts() {
//        productDao.getAllProducts()
    }

}