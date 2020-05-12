package com.example.mezacart.DataSources.Network.ProductsAPI


data class Data(
    val attributes: Attributes,
    val id: Int,
    val relationships: Relationships,
    val type: String
)