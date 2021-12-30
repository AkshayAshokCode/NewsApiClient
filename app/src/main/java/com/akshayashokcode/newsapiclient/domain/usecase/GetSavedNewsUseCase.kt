package com.akshayashokcode.newsapiclient.domain.usecase

import com.akshayashokcode.newsapiclient.data.model.Article
import com.akshayashokcode.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}