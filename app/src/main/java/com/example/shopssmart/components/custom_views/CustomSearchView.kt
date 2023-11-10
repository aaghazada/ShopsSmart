package com.example.shopssmart.components.custom_views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.shopssmart.databinding.LayoutCustomSearchBinding

class CustomSearchView @JvmOverloads constructor(
    ctx: Context,
    attrSet: AttributeSet? = null,
    styleDef: Int = 0
) : LinearLayout(ctx, attrSet, styleDef) {
    private val binding: LayoutCustomSearchBinding =
        LayoutCustomSearchBinding.inflate(LayoutInflater.from(context), this, true)
    init {
        addView(binding.root)
    }
}