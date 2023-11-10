package com.example.shopssmart.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<T, Binding : ViewBinding>(
    private val binding: Binding
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun bind(item: T)
}