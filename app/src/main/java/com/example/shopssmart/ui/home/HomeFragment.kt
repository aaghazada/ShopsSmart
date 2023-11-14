package com.example.shopssmart.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shopssmart.base.BaseFragment
import com.example.shopssmart.components.adapters.ProductAdapter
import com.example.shopssmart.databinding.FragmentHomeBinding
import com.example.shopssmart.util.Mock.getMockProducts

class HomeFragment: BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var productAdapter: ProductAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {

        productAdapter = ProductAdapter()
        binding.recyclerViewProducts.layoutManager = GridLayoutManager(requireContext(), 2,)

        val list = getMockProducts()
        binding.recyclerViewProducts.adapter = productAdapter
        productAdapter.setData(list)
    }
}