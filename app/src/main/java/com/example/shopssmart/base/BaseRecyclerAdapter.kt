package com.example.shopssmart.base

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseRecyclerAdapter<T, Binding : ViewBinding, VH : BaseViewHolder<T, Binding>> :
    RecyclerView.Adapter<VH>() {
    private var items: List<T> = emptyList()

    fun setData(data: List<T>) {
        items = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = createViewBinding(parent, viewType)
        return createViewHolder(binding, viewType)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    abstract fun createViewBinding(parent: ViewGroup, viewType: Int): Binding

    abstract fun createViewHolder(binding: Binding, viewType: Int): VH
}
