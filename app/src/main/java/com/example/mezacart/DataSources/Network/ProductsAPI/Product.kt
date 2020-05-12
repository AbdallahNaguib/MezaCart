package com.example.mezacart.DataSources.Network.ProductsAPI


data class Product(
    val `data`: List<Data>,
    val links: Links,
    val meta: Meta
)