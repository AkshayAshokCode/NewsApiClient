package com.akshayashokcode.newsapiclient.presentation.di

import com.akshayashokcode.newsapiclient.data.db.ArticleDao
import com.akshayashokcode.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.akshayashokcode.newsapiclient.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Provides
    @Singleton
    fun provideLocalDataSource(articleDao: ArticleDao):NewsLocalDataSource{
        return NewsLocalDataSourceImpl(articleDao)
    }
}