package com.feature_product.ui.products

import androidx.lifecycle.ViewModel
import com.feature_product.domain.usecase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(private val getProductsUseCase: GetProductsUseCase) :
    ViewModel() {


}