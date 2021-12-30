package com.akshayashokcode.newsapiclient.domain.usecase

import com.akshayashokcode.newsapiclient.data.model.APIResponse
import com.akshayashokcode.newsapiclient.data.util.Resource
import com.akshayashokcode.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute():Resource<APIResponse>{
        return newsRepository.getNewHeadlines()
    }
}