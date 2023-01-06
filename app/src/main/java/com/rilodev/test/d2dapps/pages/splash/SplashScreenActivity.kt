package com.rilodev.test.d2dapps.pages.splash

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.rilodev.test.d2dapps.core.utils.Utils.movePageAndRemoveTask
import com.rilodev.test.d2dapps.databinding.ActivitySplashScreenBinding
import com.rilodev.test.d2dapps.pages.auth.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashScreenActivity : AppCompatActivity() {
    private var _binding: ActivitySplashScreenBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            movePageAndRemoveTask(destination = LoginActivity::class.java)
        }, 2000)
    }
}