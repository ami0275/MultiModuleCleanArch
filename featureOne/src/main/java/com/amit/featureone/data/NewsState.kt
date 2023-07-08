package com.amit.featureone.data

import com.amit.featureone.data.model.Article

data class NewsState(
    val isLoading:Boolean=false,
    val error:String="",
    val data:List<Article>?=null
)
