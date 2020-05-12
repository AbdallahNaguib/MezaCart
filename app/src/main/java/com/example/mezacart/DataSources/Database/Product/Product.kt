package com.example.mezacart.DataSources.Database.Product

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey
    var id:Long,
    var sectionId:Long,
    var title:String,
    var summary:String,
    var content:String,
    var img:String,
    var price:Int,
    var discount:Int,
    var views:Int,
    var currencyId:Long
)