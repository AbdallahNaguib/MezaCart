package com.example.mezacart.DataSources.Database.Cart

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "carts")
data class Cart(
    @PrimaryKey
    var id:Long,
    var productId:Long
)