package com.amit.featureone.di

import com.amit.featureone.data.NewsRepoImpl
import com.amit.featureone.data.network.NewsApiService
import com.amit.featureone.data.room.NewsDAO
import com.amit.featureone.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object NewsDataModule {


    @Provides
    fun provideNewsApiService(retrofit: Retrofit): NewsApiService {
        return retrofit.create(NewsApiService::class.java)
    }


    @Provides
    fun provideNewsRepository(newsApiService: NewsApiService,newsDAO: NewsDAO):NewsRepository{
        return NewsRepoImpl(newsApiService,newsDAO)
    }

}