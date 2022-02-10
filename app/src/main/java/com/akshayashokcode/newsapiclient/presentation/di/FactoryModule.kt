package com.akshayashokcode.newsapiclient.presentation.di

import android.app.Application
import com.akshayashokcode.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.akshayashokcode.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.akshayashokcode.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Provides
    @Singleton
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase
    ):NewsViewModelFactory{
        return NewsViewModelFactory(application,getNewsHeadlinesUseCase,getSearchedNewsUseCase)
    }
}