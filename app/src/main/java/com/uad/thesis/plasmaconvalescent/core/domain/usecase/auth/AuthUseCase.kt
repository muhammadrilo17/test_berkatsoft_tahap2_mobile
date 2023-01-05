package com.uad.thesis.plasmaconvalescent.core.domain.usecase.auth

import com.uad.thesis.plasmaconvalescent.core.domain.usecase.auth.login.LoginAuthUseCase

data class AuthUseCase(
    val loginAuthUseCase: LoginAuthUseCase
)