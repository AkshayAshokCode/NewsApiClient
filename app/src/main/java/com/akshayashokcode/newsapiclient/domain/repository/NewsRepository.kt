package com.akshayashokcode.newsapiclient.domain.repository

import com.akshayashokcode.newsapiclient.data.model.APIResponse
import com.akshayashokcode.newsapiclient.data.model.Article
import com.akshayashokcode.newsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewHeadlines():Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery:String):Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}