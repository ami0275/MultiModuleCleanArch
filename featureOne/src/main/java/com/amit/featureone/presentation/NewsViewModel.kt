package com.amit.featureone.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amit.common.utils.Resource
import com.amit.featureone.data.NewsState
import com.amit.featureone.domain.useCase.GetNewsArticleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase) :
    ViewModel() {

    private val _newsArticle = MutableStateFlow(NewsState())
    val newsArticle: StateFlow<NewsState> = _newsArticle


    init {

        getNewsArticles()
    }

    private fun getNewsArticles() {
        getNewsArticleUseCase().onEach {
            when (it) {
                is Resource.Loading -> {
                    _newsArticle.value = NewsState(isLoading = true)
                }
                is Resource.Error -> {
                    _newsArticle.value = NewsState(error = it.message)
                }
                is Resource.Success -> {
                    _newsArticle.value = NewsState(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }

}