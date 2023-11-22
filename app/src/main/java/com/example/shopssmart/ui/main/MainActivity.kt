package com.example.shopssmart.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.shopssmart.R
import com.example.shopssmart.base.BaseActivity
import com.example.shopssmart.databinding.ActivityMainBinding
import com.example.shopssmart.ui.details.ProductDetailsFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var navController: NavController
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        initViews()
        setupBottomNav()
    }

    private fun initViews() {
        binding.imgBackArrow.setOnClickListener {
            onBackPressed()
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

        }
    }
}