package com.example.shopssmart.components.view_holders

import com.example.shopssmart.base.BaseViewHolder
import com.example.shopssmart.databinding.ItemDialogViewBinding
import com.example.shopssmart.model.local.DialogModel

class DialogViewHolder(
    val binding: ItemDialogViewBinding
) : BaseViewHolder<DialogModel, ItemDialogViewBinding>(binding) {
    override fun bind(item: DialogModel) {
        binding.txtTitle.text = item.title


    }
}