package com.uad.thesis.plasmaconvalescent.core.domain.usecase.auth.login

import com.uad.thesis.plasmaconvalescent.core.data.Resource
import com.uad.thesis.plasmaconvalescent.core.domain.repository.IAuthRepository
import javax.inject.Inject

class LoginAuthUseCase @Inject constructor(private val repository: IAuthRepository) {
    suspend operator fun invoke(email: String, password: String): Resource<Boolean> {
        // TODO:
        return Resource.Loading()
    }
}