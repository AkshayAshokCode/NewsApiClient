package com.akshayashokcode.newsapiclient.domain.usecase

import com.akshayashokcode.newsapiclient.data.model.APIResponse
import com.akshayashokcode.newsapiclient.data.model.Article
import com.akshayashokcode.newsapiclient.data.util.Resource
import com.akshayashokcode.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)= newsRepository.saveNews(article)
}