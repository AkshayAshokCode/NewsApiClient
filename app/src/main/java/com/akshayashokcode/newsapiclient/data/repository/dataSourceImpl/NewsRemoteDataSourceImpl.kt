package com.akshayashokcode.newsapiclient.data.repository.dataSourceImpl

import com.akshayashokcode.newsapiclient.data.api.NewsAPIService
import com.akshayashokcode.newsapiclient.data.model.APIResponse
import com.akshayashokcode.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,

):NewsRemoteDataSource {
    override suspend fun getTopHeadlines( country: String, page: Int): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }
}