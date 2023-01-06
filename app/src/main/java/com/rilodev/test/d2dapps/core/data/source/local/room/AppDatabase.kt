package com.rilodev.test.d2dapps.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rilodev.test.d2dapps.core.data.source.local.entitiy.LoginEntity

@Database(entities = [LoginEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun appDao(): AppDao

}