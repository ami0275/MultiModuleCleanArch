package com.amit.featureone.data.model

data class NewsResponse(
    val articles: List<ArticleDTO>,
    val status: String,
    val totalResults: Int
)