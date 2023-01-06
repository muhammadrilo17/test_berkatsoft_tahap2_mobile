package com.rilodev.test.d2dapps.core.data.source.local.entitiy

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login")
data class LoginEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "login")
    var loginId: String,
)