package com.feature_product.domain.usecase

import com.feature_product.data.models.Product
import com.feature_product.domain.repo.ProductRepository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(private val repository: ProductRepository) {
    operator fun invoke(): List<Product> {
        // Fetch products from the data source
    }
}