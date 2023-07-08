package com.amit.featureone.data.mapper

import com.amit.featureone.data.model.Article
import com.amit.featureone.data.model.ArticleDTO




fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author?:"",
        content = this.content?:"",
        description = this.description?:"",
        title = this.title?:"",
        urlToImage = this.urlToImage?:""
    )
}
