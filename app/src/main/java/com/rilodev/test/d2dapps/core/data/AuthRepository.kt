package com.rilodev.test.d2dapps.core.data

import com.rilodev.test.d2dapps.core.data.source.local.LocalDataSource
import com.rilodev.test.d2dapps.core.data.source.remote.RemoteDataSource
import com.rilodev.test.d2dapps.core.domain.repository.IAuthRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    ): IAuthRepository  {

}