package com.example.shopssmart.components.custom_views

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.shopssmart.databinding.LayoutCustomInputBinding

class CustomInputView @JvmOverloads constructor(
    ctx: Context,
    attrSet: AttributeSet? = null,
    styleDef: Int = 0
) : LinearLayout(ctx, attrSet, styleDef) {
    private val binding: LayoutCustomInputBinding =
        LayoutCustomInputBinding.inflate(LayoutInflater.from(context), this, true)

    private var textInput = binding.inputText.text.toString()

    init {
        binding.inputText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                textInput = s.toString()
            }
        })
    }

//    fun setTitle(text: String) {
//        binding.textPlaceHolder.setText(text)
//    }

    private fun setTitle(title: String) {
        binding.textPlaceHolder.text = title
    }

    fun setInput(input: String) {
        binding.inputText.setText(input)
    }
}