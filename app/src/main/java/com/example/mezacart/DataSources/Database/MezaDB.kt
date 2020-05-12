package com.example.mezacart.DataSources.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mezacart.DataSources.Database.Cart.Cart
import com.example.mezacart.DataSources.Database.Cart.CartDao
import com.example.mezacart.DataSources.Database.Product.Product
import com.example.mezacart.DataSources.Database.Product.ProductDao
import com.example.mezacart.DataSources.Database.Section.Section
import com.example.mezacart.DataSources.Database.Section.SectionDao

@Database(entities = [Product::class,Cart::class,Section::class],version = 1,exportSchema = false)

abstract class MezaDB : RoomDatabase(){

    abstract val productDao:ProductDao
    abstract val sectionDao:SectionDao
    abstract val cartDao:CartDao

    companion object{

        // volatile makes sure that the variable is
        // never cached and thus thread-safe
        @Volatile
        private var INSTANCE:MezaDB? = null

        fun getInstance(context: Context):MezaDB{
            synchronized(this){

                var instance = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MezaDB::class.java,
                        "mezaDB"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}