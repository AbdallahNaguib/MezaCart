package com.example.mezacart.DataSources.Database.Section

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.mezacart.DataSources.Database.Product.Product

@Dao
interface SectionDao{
    @Insert
    fun insert(section: Section)

    @Query("delete from sections")
    fun clear()

    @Query("select * from sections where id = :key")
    fun get(key:Long): Section

    @Query("select * from sections order by id desc")
    fun getAllSections(): LiveData<List<Section>>
}