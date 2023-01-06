package com.rilodev.test.d2dapps.core.di

import android.content.Context
import androidx.room.Room
import com.rilodev.test.d2dapps.core.data.source.local.room.AppDao
import com.rilodev.test.d2dapps.core.data.source.local.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "Tourism.db"
    ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideAppDao(database: AppDatabase): AppDao = database.appDao()
}