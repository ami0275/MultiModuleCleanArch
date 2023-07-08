package com.amit.featureone.data

import com.amit.featureone.data.mapper.toDomainArticle
import com.amit.featureone.data.model.Article
import com.amit.featureone.data.network.NewsApiService
import com.amit.featureone.data.room.NewsDAO
import com.amit.featureone.domain.repository.NewsRepository



class NewsRepoImpl(private val newsApiService: NewsApiService, private val newsDAO: NewsDAO) :
    NewsRepository {
    override suspend fun getNewsArticle(): List<Article> {
        return try {
            val temp =
                newsApiService.getNewsArticles(country = "us").articles.map { it.toDomainArticle() }
            newsDAO.insertList(temp)
            newsDAO.getNewsArticle()
        } catch (e: Exception) {
            newsDAO.getNewsArticle()
        }
    }
}