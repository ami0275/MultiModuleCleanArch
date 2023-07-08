package com.amit.featureone.domain.useCase

import com.amit.common.utils.Resource
import com.amit.featureone.data.model.Article
import com.amit.featureone.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNewsArticleUseCase (private val newsRepository: NewsRepository) {

    operator fun invoke():Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data=newsRepository.getNewsArticle()))
        }catch (e:Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}
