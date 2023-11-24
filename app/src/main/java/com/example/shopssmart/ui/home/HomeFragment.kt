package com.example.shopssmart.ui.home

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shopssmart.R
import com.example.shopssmart.base.BaseFragment
import com.example.shopssmart.components.adapters.BannerAdapter
import com.example.shopssmart.components.adapters.CategoryAdapter
import com.example.shopssmart.components.adapters.ProductAdapter
import com.example.shopssmart.databinding.FragmentHomeBinding
import com.example.shopssmart.util.BundleNames.SELECTED_ITEM
import com.example.shopssmart.util.Mock.getMockBanner
import com.example.shopssmart.util.Mock.getMockCategory
import com.example.shopssmart.util.Mock.getMockProducts
import com.example.shopssmart.util.UtilFunctions.getNavOptions

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var productAdapter: ProductAdapter
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var bannerAdapter: BannerAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        productAdapter = ProductAdapter { productModel ->
            findNavController().navigate(
                R.id.action_homeFragment_to_productDetailsFragment,
                bundleOf(SELECTED_ITEM to productModel),
                getNavOptions()
            )

        }
        categoryAdapter = CategoryAdapter { selectedCategory ->

        }
        bannerAdapter = BannerAdapter()

        binding.recyclerViewCategory.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewProducts.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerViewBanner.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val productList = getMockProducts()
        val categoryList = getMockCategory()
        val bannerList = getMockBanner()

        binding.recyclerViewProducts.adapter = productAdapter
        binding.recyclerViewCategory.adapter = categoryAdapter
        binding.recyclerViewBanner.adapter = bannerAdapter

        productAdapter.setData(productList)
        categoryAdapter.setData(categoryList)
        bannerAdapter.setData(bannerList)

    }
}