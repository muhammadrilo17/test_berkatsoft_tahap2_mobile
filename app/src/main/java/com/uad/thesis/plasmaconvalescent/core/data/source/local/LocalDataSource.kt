package com.uad.thesis.plasmaconvalescent.core.data.source.local

import com.uad.thesis.plasmaconvalescent.core.data.source.local.room.AppDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSource @Inject constructor(private val appDao: AppDao)  {
}