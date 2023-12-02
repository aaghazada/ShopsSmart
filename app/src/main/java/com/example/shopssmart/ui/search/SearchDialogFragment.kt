package com.example.shopssmart.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shopssmart.base.BaseDialogFragment
import com.example.shopssmart.components.adapters.DialogAdapter
import com.example.shopssmart.components.adapters.ProductAdapter
import com.example.shopssmart.databinding.DialogSearchInputBinding
import com.example.shopssmart.util.Mock

class SearchDialogFragment :
    BaseDialogFragment<DialogSearchInputBinding>(DialogSearchInputBinding::inflate) {
    private lateinit var dialogAdapter: DialogAdapter

    var onSearch: (String) -> Unit = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(
            DialogFragment.STYLE_NORMAL,
            android.R.style.Theme_Light_NoTitleBar_Fullscreen
        )

    }

    private fun initView() {
        dialogAdapter = DialogAdapter()

        binding.recyclerViewSearch.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        val dialogList = Mock.getDialogSearch()

        binding.recyclerViewSearch.adapter = DialogAdapter()
        dialogAdapter.setData(dialogList)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.inputSearch.onSearchInView = {
            onSearch(it)
            dismiss()
        }
        initView()
    }
}