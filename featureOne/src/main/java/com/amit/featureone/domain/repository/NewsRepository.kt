package com.amit.featureone.domain.repository

import com.amit.featureone.data.model.Article

interface NewsRepository {
    suspend fun getNewsArticle():List<Article>
}
