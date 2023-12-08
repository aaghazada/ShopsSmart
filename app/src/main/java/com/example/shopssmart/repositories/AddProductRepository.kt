package com.example.shopssmart.repositories

import android.net.Uri
import com.example.shopssmart.model.local.ProductModel
import com.example.shopssmart.util.FirebaseReferenceName
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import javax.inject.Inject

class AddProductRepository @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val firebaseStorage: FirebaseStorage
) {

    fun addNewProduct(productModel: ProductModel) {
        val productRef = firebaseDatabase.getReference(
            FirebaseReferenceName.PRODUCT_REFERENCE_NAME
        )

        productRef.setValue(productModel)
    }

    fun uploadImage(imageUri: Uri, onUploadComplete: (String) -> Unit) {
        val uploadRef = firebaseStorage.reference.child(
            "images${System.currentTimeMillis()}.jpg"
        )

        uploadRef.putFile(imageUri).addOnCompleteListener {
            val imageUrl = uploadRef.downloadUrl.addOnSuccessListener {
                onUploadComplete.invoke(it.toString())
            }
        }.addOnCanceledListener {

        }
    }
}