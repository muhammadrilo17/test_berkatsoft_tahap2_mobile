package com.rilodev.test.d2dapps.core.utils

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AlertDialog
import com.rilodev.test.d2dapps.databinding.LogoutDialogBinding

object CustomDialog {
    fun Activity.confirmExitDialog(
        instructionText: String = "",
        destination: Class<*>? = null,
        action: (() -> Unit) = {}
    ): AlertDialog {
        val builder = AlertDialog.Builder(this).create()
        val view = LogoutDialogBinding.inflate(layoutInflater)

        if (instructionText.isNotEmpty()) view.instruction.text = instructionText
        view.btnNo.setOnClickListener { builder.dismiss() }
        view.btnYes.setOnClickListener {
            if (destination != null) {
                val intent = Intent(this, destination)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                action()
                startActivity(intent)
            }
            finishAndRemoveTask()
        }

        builder.setView(view.root)
        builder.setCancelable(true)
        builder.show()
        return builder
    }
}