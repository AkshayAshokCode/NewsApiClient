package com.akshayashokcode.newsapiclient.presentation.di

import com.akshayashokcode.newsapiclient.data.repository.NewsRepositoryImpl
import com.akshayashokcode.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.akshayashokcode.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.akshayashokcode.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ):NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource,newsLocalDataSource)
    }
}