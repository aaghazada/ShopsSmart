package com.example.shopssmart.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import com.example.shopssmart.base.BaseActivity
import com.example.shopssmart.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)
    }
}
