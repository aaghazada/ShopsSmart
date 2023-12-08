package com.example.shopssmart.components.view_holders

import com.example.shopssmart.R
import com.example.shopssmart.base.BaseViewHolder
import com.example.shopssmart.components.adapters.ProductAdapter
import com.example.shopssmart.databinding.ItemProductViewBinding
import com.example.shopssmart.model.local.ProductModel

class ProductViewHolder(
    val binding: ItemProductViewBinding,
    val onClick: (ProductModel) -> Unit
) :
    BaseViewHolder<ProductModel, ItemProductViewBinding>(binding) {
    override fun bind(item: ProductModel) {
        binding.txtProductPrice.text = item.price
        binding.txtProductTitle.text = item.productTitle
        item.productImage?.let { binding.productImage.setImageResource() }

        if (item.isFavourite) {
            binding.imgMakeFavourite.setImageResource((R.drawable.ic_heart_red))
        } else {
            binding.imgMakeFavourite.setImageResource((R.drawable.ic_heart))

        }

        binding.itemCardView.setOnClickListener {
            onClick(item)
        }

    }
}