package com.example.shopssmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.shopssmart.base.BaseRecyclerAdapter
import com.example.shopssmart.components.view_holders.BannerViewHolder
import com.example.shopssmart.databinding.ItemBannerViewBinding
import com.example.shopssmart.model.local.BannerModel


class BannerAdapter : BaseRecyclerAdapter<BannerModel, ItemBannerViewBinding, BannerViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemBannerViewBinding {
        return ItemBannerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(
        binding: ItemBannerViewBinding,
        viewType: Int
    ): BannerViewHolder {
        return BannerViewHolder(binding)
    }
}