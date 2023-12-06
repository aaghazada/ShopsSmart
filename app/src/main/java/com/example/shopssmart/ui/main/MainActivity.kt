package com.example.shopssmart.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.shopssmart.R
import com.example.shopssmart.base.BaseActivity
import com.example.shopssmart.databinding.ActivityMainBinding
import com.example.shopssmart.ui.search.SearchDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var navController: NavController
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        initViews()
        setupBottomNav()
        floatingButton()
    }

    private fun floatingButton() {
        binding.floatingButton.setOnClickListener {
            findNavController(R.id.floating_button).navigate(R.id.action_homeFragment_to_addProductFragment)
        }
    }

    private fun initViews() {
        binding.imgBackArrow.setOnClickListener {
            onBackPressed()
        }

        binding.searchView.setOnClickListener{
            val dialog = SearchDialogFragment()
            dialog.show(supportFragmentManager, "")
            dialog.onSearch = {
                Log.i("searchValue", it)
            }
        }
    }

    private fun setupBottomNav() {
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavBar.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            binding.searchView.apply {
                isVisible = destination.id in setOf(
                    R.id.homeFragment
                )
            }

            binding.txtAppBarTitle.apply {
                text = controller.currentDestination?.label
                isVisible = destination.id !in setOf(
                    R.id.homeFragment
                )
            }

            binding.imgBackArrow.apply {
                isVisible = destination.id !in setOf(
                    R.id.homeFragment
                )
            }

            binding.bottomNavBar.apply {
                isVisible = destination.id !in setOf(
                    R.id.productDetailsFragment
                )
            }

        }

    }
}