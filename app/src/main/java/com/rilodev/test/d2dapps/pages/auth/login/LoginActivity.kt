package com.rilodev.test.d2dapps.pages.auth.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.rilodev.test.d2dapps.core.utils.Utils.clickOnBackPressed
import com.rilodev.test.d2dapps.core.utils.Utils.movePage
import com.rilodev.test.d2dapps.core.utils.Utils.setShowHidePassword
import com.rilodev.test.d2dapps.databinding.ActivityLoginBinding
import com.rilodev.test.d2dapps.pages.auth.register.RegisterActivity
import com.rilodev.test.d2dapps.pages.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!
    private var isPasswordLoginHide = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        showHidePasswordSetup()

        buttonSignInListener()
        registerListener()
        clickOnBackPressed {

        }
    }

    private fun showHidePasswordSetup() {
        with(binding.inputPassword) {
            btnShowHide.setOnClickListener {
                isPasswordLoginHide = setShowHidePassword(
                    inputPassword,
                    isPasswordLoginHide,
                    btnShowHide
                )
            }
        }
    }

    private fun buttonSignInListener() {
        binding.btnSignIn.setOnClickListener {
            if (binding.inputEmail.isEmailRight && binding.inputPassword.inputPassword.isPasswordRight) {
                login(binding.inputEmail.value, binding.inputPassword.inputPassword.value)
            } else {
                if(!binding.inputEmail.isEmailRight) binding.inputEmail.triggerEmptyField()
                else binding.inputPassword.inputPassword.triggerEmptyField()
            }
        }
    }

    private fun login(email: String, password: String) {
        movePage(MainActivity::class.java)
    }


    private fun registerListener() {
        binding.btnCreateNewAccount.setOnClickListener {
            movePage(RegisterActivity::class.java)
        }
    }

}