package com.example.mezacart.DataSources.Network.ProductsAPI


data class Response(
    val `data`: List<Data>,
    val links: Links,
    val meta: Meta
)