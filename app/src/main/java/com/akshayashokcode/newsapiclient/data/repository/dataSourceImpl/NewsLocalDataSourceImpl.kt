package com.akshayashokcode.newsapiclient.data.repository.dataSourceImpl

import com.akshayashokcode.newsapiclient.data.db.ArticleDao
import com.akshayashokcode.newsapiclient.data.model.Article
import com.akshayashokcode.newsapiclient.data.repository.dataSource.NewsLocalDataSource

class NewsLocalDataSourceImpl(
    private val articleDao: ArticleDao
):NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDao.insert(article)
    }
}