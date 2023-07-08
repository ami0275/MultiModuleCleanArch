package com.amit.featurebase.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * This Is A Base Fragment
 **/
abstract class BaseFragment</*VM : ViewModel,*/B : ViewBinding>(val bindingFactory: (LayoutInflater) -> B) :
    Fragment() {

    lateinit var binding: B

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = bindingFactory(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeViews()
        initializeObservers()
    }

    abstract fun initializeViews()

    abstract fun initializeObservers()


}