package com.amit.featureone.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


    fun <T> AppCompatActivity.collectLatestLifecycleFlow(
        flow: Flow<T>,
        state: Lifecycle.State = Lifecycle.State.CREATED,
        collect: suspend (T) -> Unit
    ) {
        lifecycleScope.launch {
            repeatOnLifecycle(state) {
                flow.collectLatest(collect)
            }
        }
    }

    fun <T> Fragment.collectLatestLifecycleFlow(
        flow: Flow<T>,
        viewLifecycleOwner: LifecycleOwner,
        state: Lifecycle.State = Lifecycle.State.CREATED,
        collect: suspend (T) -> Unit
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(state) {
                flow.collectLatest(collect)
            }
        }
    }