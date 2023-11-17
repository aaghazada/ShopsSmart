package com.example.shopssmart.components.view_holders

import com.example.shopssmart.base.BaseViewHolder
import com.example.shopssmart.databinding.ItemBannerViewBinding
import com.example.shopssmart.model.local.BannerModel

class BannerViewHolder(
    val binding: ItemBannerViewBinding
) :
    BaseViewHolder<BannerModel, ItemBannerViewBinding>(binding) {
    override fun bind(item: BannerModel) {
        binding.imageBanner.setImageResource(item.bannerIcon)
    }
}