package com.example.mezacart.DataSources.Database.Section

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sections")
data class Section(
    @PrimaryKey
    var id:Long,
    var title:String,
    var img:String
)