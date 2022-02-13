package com.akshayashokcode.newsapiclient.presentation.di

import com.akshayashokcode.newsapiclient.domain.repository.NewsRepository
import com.akshayashokcode.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.akshayashokcode.newsapiclient.domain.usecase.GetSavedNewsUseCase
import com.akshayashokcode.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.akshayashokcode.newsapiclient.domain.usecase.SaveNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetNewsHeadLinesUseCase(
        newsRepository: NewsRepository
    ):GetNewsHeadlinesUseCase{
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Provides
    @Singleton
    fun provideGetSearchedNewsUseCase(
        newsRepository: NewsRepository
    ):GetSearchedNewsUseCase{
        return GetSearchedNewsUseCase(newsRepository)
    }

    @Provides
    @Singleton
    fun provideSaveNewsUseCase(
        newsRepository: NewsRepository
    ):SaveNewsUseCase{
        return SaveNewsUseCase(newsRepository)
    }

    @Provides
    @Singleton
    fun provideGetSavedNewsUseCase(
        newsRepository: NewsRepository
    ):GetSavedNewsUseCase{
        return GetSavedNewsUseCase(newsRepository)
    }
}