package com.uad.thesis.plasmaconvalescent.core.data

import com.uad.thesis.plasmaconvalescent.core.data.source.local.LocalDataSource
import com.uad.thesis.plasmaconvalescent.core.data.source.remote.RemoteDataSource
import com.uad.thesis.plasmaconvalescent.core.domain.repository.IAuthRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    ): IAuthRepository  {

}