package com.example.mezacart.DataSources.Database.Product

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao{
    @Insert
    fun insert(product:Product)

    @Query("delete from products")
    fun clear()

    @Query("select * from products where id = :key")
    fun get(key:Long):Product

    @Query("select * from products order by id desc")
    fun getAllProducts(): LiveData<List<Product>>
}