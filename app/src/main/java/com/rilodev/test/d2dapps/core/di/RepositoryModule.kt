package com.rilodev.test.d2dapps.core.di

import com.rilodev.test.d2dapps.core.data.AuthRepository
import com.rilodev.test.d2dapps.core.domain.repository.IAuthRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(loginRepository: AuthRepository): IAuthRepository
}
