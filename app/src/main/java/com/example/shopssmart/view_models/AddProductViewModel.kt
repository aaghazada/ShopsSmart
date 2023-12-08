package com.example.shopssmart.view_models

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.example.shopssmart.model.local.ProductModel
import com.example.shopssmart.repositories.AddProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddProductViewModel @Inject constructor(private val addProductRepository: AddProductRepository) :
    ViewModel() {

    fun addNewProduct(productModel: ProductModel) {
        addProductRepository.addNewProduct(productModel)
    }

    fun uploadImage(imageUri: Uri, onUploadComplete: (String) -> Unit) {
        addProductRepository.uploadImage(imageUri) {
            onUploadComplete.invoke(it)
        }
    }
}