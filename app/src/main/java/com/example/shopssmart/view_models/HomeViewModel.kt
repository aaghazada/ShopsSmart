package com.example.shopssmart.view_models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shopssmart.model.local.ProductModel
import com.example.shopssmart.repositories.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) : ViewModel() {

    private val _productsLiveData: MutableLiveData<ArrayList<ProductModel>> = MutableLiveData()
    val productsLiveData: LiveData<ArrayList<ProductModel>> = _productsLiveData
    fun getAllProduct() {
        homeRepository.getAllProducts()
    }

    fun addNewProduct(productModel: ProductModel) {
        homeRepository.addNewProduct(productModel)
    }

}