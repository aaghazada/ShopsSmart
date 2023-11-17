package com.example.shopssmart.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.shopssmart.R
import com.example.shopssmart.base.BaseActivity
import com.example.shopssmart.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var navController: NavController
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        setupBottomNav()
    }

    private fun setupBottomNav() {

        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavBar.setupWithNavController(navController)

//        navController.addOnDestinationChangedListener{ controller, destination, arguments ->
//
//
//        }

    }
}
