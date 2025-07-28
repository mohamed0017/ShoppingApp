package com.feature_product.data.di

import com.feature_product.domain.usecase.GetProductsUseCase
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideGetProductsUseCase(): GetProductsUseCase {
        return GetProductsUseCase()
    }
}