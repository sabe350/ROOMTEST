package com.example.cam.Model

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.Date

class Converters {
    @TypeConverter
    fun fromTimestamp(v: Long?): Date? = v?.let { Date(it) }
    @TypeConverter
    fun dateToTimestamp(d: Date?): Long? = d?.time
}

@Database(entities=[UsuarioEntity::class], version=1)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase()