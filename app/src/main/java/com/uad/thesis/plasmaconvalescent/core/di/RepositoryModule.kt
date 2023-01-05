package com.uad.thesis.plasmaconvalescent.core.di

import com.uad.thesis.plasmaconvalescent.core.data.AuthRepository
import com.uad.thesis.plasmaconvalescent.core.domain.repository.IAuthRepository
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
