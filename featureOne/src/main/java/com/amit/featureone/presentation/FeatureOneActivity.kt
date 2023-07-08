package com.amit.featureone.presentation

import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.amit.featurebase.base.BaseActivity
import com.amit.featureone.R
import com.amit.featureone.databinding.FeatureActivityMainBinding
import com.amit.featureone.utils.collectLatestLifecycleFlow
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest


@AndroidEntryPoint
class FeatureOneActivity : BaseActivity<FeatureActivityMainBinding>(FeatureActivityMainBinding::inflate) {

    private val newsViewModel: NewsViewModel by viewModels()

    override fun initializeViews() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FeatureOneFragment())
            .commitNow()
    }

    override fun initializeObservers() {
        collectLatestLifecycleFlow(newsViewModel.newsArticle) {
            newsViewModel.newsArticle.collectLatest {
                if (it.isLoading) {
                    //binding.progressBar.visibility= View.VISIBLE
                }
                if (it.error.isNotBlank()) {
                   // binding.progressBar.visibility= View.GONE
                }
                it.data?.let {
                 /*   binding.progressBar.visibility= View.GONE
                    newsAdapter.setData(it)*/
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }
}

