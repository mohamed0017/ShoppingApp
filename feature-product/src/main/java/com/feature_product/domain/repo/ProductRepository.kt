package com.feature_product.domain.repo

import com.feature_product.data.models.Product

interface ProductRepository {
    fun getProducts(): List<Product>
}