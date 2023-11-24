package com.example.shopssmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.shopssmart.base.BaseRecyclerAdapter
import com.example.shopssmart.components.view_holders.DialogViewHolder
import com.example.shopssmart.databinding.ItemDialogViewBinding
import com.example.shopssmart.model.local.DialogModel

class DialogAdapter : BaseRecyclerAdapter<DialogModel, ItemDialogViewBinding, DialogViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemDialogViewBinding {
        return ItemDialogViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(
        binding: ItemDialogViewBinding,
        viewType: Int
    ): DialogViewHolder {
        return DialogViewHolder(binding)
    }
}