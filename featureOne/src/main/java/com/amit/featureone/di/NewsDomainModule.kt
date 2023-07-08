package com.amit.featureone.di

import com.amit.featureone.domain.repository.NewsRepository
import com.amit.featureone.domain.useCase.GetNewsArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object NewsDomainModule {


    @Provides
    fun provideGetNewsUseCase(newsRepository: NewsRepository):GetNewsArticleUseCase{
        return GetNewsArticleUseCase(newsRepository)
    }


}