package com.rilodev.test.d2dapps.core.domain.usecase.auth

import com.rilodev.test.d2dapps.core.domain.usecase.auth.login.LoginAuthUseCase

data class AuthUseCase(
    val loginAuthUseCase: LoginAuthUseCase
)