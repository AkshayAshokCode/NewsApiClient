package com.akshayashokcode.newsapiclient.presentation.di

import com.akshayashokcode.newsapiclient.data.api.NewsAPIService
import com.akshayashokcode.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.akshayashokcode.newsapiclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Provides
    @Singleton
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService):NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}