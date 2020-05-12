package com.example.mezacart.DataSources.Network.ProductsAPI


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("current_page")
    val currentPage: Int,
    val from: Int,
    @SerializedName("last_page")
    val lastPage: Int,
    val path: String,
    @SerializedName("per_page")
    val perPage: Int,
    val to: Int,
    val total: Int
)