package com.akshayashokcode.newsapiclient.data.repository.dataSource

import com.akshayashokcode.newsapiclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<APIResponse>
}