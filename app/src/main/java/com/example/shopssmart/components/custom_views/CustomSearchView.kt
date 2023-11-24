package com.example.shopssmart.components.custom_views

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import android.widget.LinearLayout
import com.example.shopssmart.databinding.LayoutCustomSearchBinding

class CustomSearchView @JvmOverloads constructor(
    ctx: Context,
    attrSet: AttributeSet? = null,
    styleDef: Int = 0
) : LinearLayout(ctx, attrSet, styleDef) {
    private val binding: LayoutCustomSearchBinding =
        LayoutCustomSearchBinding.inflate(LayoutInflater.from(context), this, true)

    var searchText = binding.editSearchInput.text.toString()

    var onSearchInView: (String) -> Unit = {}

    init {
        submit()
    }

    fun submit() {
        binding.editSearchInput.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                onSearchInView(binding.editSearchInput.text.toString())
                return@setOnEditorActionListener true
            }
            false
        }
    }

}