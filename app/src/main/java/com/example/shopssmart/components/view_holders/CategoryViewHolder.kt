package com.example.shopssmart.components.view_holders

import com.example.shopssmart.base.BaseViewHolder
import com.example.shopssmart.databinding.ItemCategoryBinding
import com.example.shopssmart.model.local.CategoryModel

class CategoryViewHolder(
    val binding: ItemCategoryBinding,
    val onClick: (CategoryModel) -> Unit
) :
    BaseViewHolder<CategoryModel, ItemCategoryBinding>(binding) {
    override fun bind(item: CategoryModel) {
        binding.txtCategoryName.text = item.categoryName
        binding.imageCategory.setImageResource(item.categoryIcon)

    }
}