package com.example.shopssmart.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.viewbinding.ViewBinding


abstract class BaseDialogFragment<VB: ViewBinding>(
    private val inflate: Inflate<VB>
) : DialogFragment() {

    private var _binding: VB? = null
    val views get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        return views.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}