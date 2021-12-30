package com.akshayashokcode.newsapiclient.domain.usecase

import com.akshayashokcode.newsapiclient.data.model.Article
import com.akshayashokcode.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)= newsRepository.deleteNews(article)
}