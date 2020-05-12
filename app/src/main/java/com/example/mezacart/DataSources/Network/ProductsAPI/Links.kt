package com.example.mezacart.DataSources.Network.ProductsAPI


import com.google.gson.annotations.SerializedName

data class Links(
    val first: String,
    val last: String,
    val next: String,
    val prev: Any
)