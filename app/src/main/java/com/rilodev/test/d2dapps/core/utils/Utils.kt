package com.rilodev.test.d2dapps.core.utils

import android.app.Activity
import android.content.Intent
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.text.method.TransformationMethod
import android.util.Patterns
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.core.app.ActivityOptionsCompat
import com.rilodev.test.d2dapps.R

object Utils {
    fun Activity.movePageAndRemoveTask(destination: Class<*>?) {
        if(destination != null) {
            val intent = Intent(this, destination)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }
        finishAndRemoveTask()
    }

    fun isEmailRight(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun Activity.movePage(destination: Class<*>, optionCompat: ActivityOptionsCompat? = null) {
        val intent = Intent(this, destination)

        if (optionCompat != null) {
            startActivity(intent, optionCompat.toBundle())
        } else startActivity(intent)
    }


    fun ComponentActivity.clickOnBackPressed(action: (() -> Unit)) {
        onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                action()
            }
        })
    }

    fun setShowHidePassword(
        editText: EditText,
        isPasswordHide: Boolean,
        button: ImageView
    ): Boolean {
        editText.transformationMethod = showHidePassword(isPasswordHide)
        button.setImageResource(
            changeShowHidePasswordIcon(isPasswordHide)
        )
        editText.setSelection(editText.length())
        return !isPasswordHide
    }

    private fun showHidePassword(isPasswordHide: Boolean): TransformationMethod {
        return if (isPasswordHide) {
            HideReturnsTransformationMethod.getInstance()
        } else {
            PasswordTransformationMethod.getInstance()
        }
    }

    private fun changeShowHidePasswordIcon(isPasswordHide: Boolean): Int {
        return if (isPasswordHide) {
            R.drawable.ic_visibility
        } else {
            R.drawable.ic_visibility_off
        }
    }
}