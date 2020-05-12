package com.example.mezacart.DataSources.Network.ProductsAPI


import com.google.gson.annotations.SerializedName

data class Attributes(
    val content: String,
    @SerializedName("created_at")
    val createdAt: String,
    val currency: String,
    @SerializedName("currency_id")
    val currencyId: Int,
    val discount: String,
    @SerializedName("final_price")
    val finalPrice: String,
    val image: String,
    @SerializedName("meta_description")
    val metaDescription: String,
    @SerializedName("meta_keywords")
    val metaKeywords: String,
    val price: String,
    val section: String,
    @SerializedName("section_id")
    val sectionId: Int,
    val slug: String,
    val summary: String,
    val tags: String,
    val title: String,
    val views: Int
)