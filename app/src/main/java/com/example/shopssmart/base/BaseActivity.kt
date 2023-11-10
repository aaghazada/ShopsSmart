package com.example.shopssmart.base

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    lateinit var binding: VB

    abstract val bindingInflater: (LayoutInflater) -> VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.WHITE
        binding = bindingInflater.invoke(layoutInflater).apply {
            setContentView(root)
        }

        onViewBindingCreated(savedInstanceState)
    }

    open fun onViewBindingCreated(savedInstanceState: Bundle?) {}

}