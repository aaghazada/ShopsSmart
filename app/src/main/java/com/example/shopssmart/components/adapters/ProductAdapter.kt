package com.example.shopssmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.shopssmart.base.BaseRecyclerAdapter
import com.example.shopssmart.components.view_holders.ProductViewHolder
import com.example.shopssmart.databinding.ItemProductViewBinding
import com.example.shopssmart.model.local.ProductModel

class ProductAdapter :
    BaseRecyclerAdapter<ProductModel, ItemProductViewBinding, ProductViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemProductViewBinding {
        return ItemProductViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(
        binding: ItemProductViewBinding,
        viewType: Int
    ): ProductViewHolder {
        return ProductViewHolder(binding)
    }
}