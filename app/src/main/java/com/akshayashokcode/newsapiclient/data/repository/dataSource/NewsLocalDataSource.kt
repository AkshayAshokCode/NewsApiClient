package com.akshayashokcode.newsapiclient.data.repository.dataSource

import com.akshayashokcode.newsapiclient.data.model.Article

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
}