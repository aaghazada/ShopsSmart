package com.example.shopssmart.ui.details

import android.os.Bundle
import android.view.View
import com.example.shopssmart.base.BaseFragment
import com.example.shopssmart.databinding.FragmentAccountBinding
import com.example.shopssmart.databinding.FragmentProductDetailsBinding
import com.example.shopssmart.model.local.ProductModel
import com.example.shopssmart.util.BundleNames.SELECTED_ITEM

class ProductDetailsFragment :
    BaseFragment<FragmentProductDetailsBinding>(FragmentProductDetailsBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }


    private fun initView() {
        val item = requireArguments().getParcelable<ProductModel>(SELECTED_ITEM)
    }
}