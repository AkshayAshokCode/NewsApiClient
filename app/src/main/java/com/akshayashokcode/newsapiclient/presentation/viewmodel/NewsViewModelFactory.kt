package com.akshayashokcode.newsapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akshayashokcode.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase
import com.akshayashokcode.newsapiclient.domain.usecase.GetSearchedNewsUseCase
import com.akshayashokcode.newsapiclient.domain.usecase.SaveNewsUseCase

class NewsViewModelFactory(
    private val app: Application,
    private val getNewsHeadLinesUseCase: GetNewsHeadlinesUseCase,
    private val getSearchedNewsUseCase: GetSearchedNewsUseCase,
    private val saveNewsUseCase: SaveNewsUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(
            app,
            getNewsHeadLinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase
        ) as T
    }
}