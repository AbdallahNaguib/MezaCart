package com.example.mezacart.DataSources.Database.Cart

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CartDao{
    @Insert
    fun insert(cart: Cart)

    @Query("delete from carts")
    fun clear()

    @Query("select * from carts order by id desc")
    fun getAllCarts(): LiveData<List<Cart>>
}