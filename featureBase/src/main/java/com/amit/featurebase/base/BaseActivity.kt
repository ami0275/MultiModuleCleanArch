package com.amit.featurebase.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.viewbinding.ViewBinding

/**
 * This Is A Base Activity
 **/

abstract class BaseActivity<B : ViewBinding>(val bindingFactory: (LayoutInflater) -> B) :
    AppCompatActivity() {

    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = bindingFactory(layoutInflater)
        setContentView(binding.root)
        initializeViews()
        initializeObservers()
    }

    abstract fun initializeViews()

    abstract fun initializeObservers()

}