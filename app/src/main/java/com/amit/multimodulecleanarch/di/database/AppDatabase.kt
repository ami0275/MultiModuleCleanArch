package com.amit.multimodulecleanarch.di.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.amit.featureone.data.model.Article
import com.amit.featureone.data.room.NewsDAO


@Database(entities = [Article::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        fun getInstance(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "app_db")
                .fallbackToDestructiveMigration().build()
        }
    }

    abstract fun getNewsDao(): NewsDAO
}