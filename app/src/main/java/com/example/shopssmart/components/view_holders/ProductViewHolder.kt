package com.example.shopssmart.components.view_holders

import com.example.shopssmart.base.BaseViewHolder
import com.example.shopssmart.databinding.ItemProductViewBinding
import com.example.shopssmart.model.local.ProductModel

class ProductViewHolder(val binding: ItemProductViewBinding) :
    BaseViewHolder<ProductModel, ItemProductViewBinding>(binding) {
    override fun bind(item: ProductModel) {
        binding.productTitle.text = item.productTitle
        binding.price.text = item.price
    }
}