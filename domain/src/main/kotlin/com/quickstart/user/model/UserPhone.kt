package com.quickstart.user.model

data class UserPhone(
    val id: Long,
    val countryCode: String,
    val areaCode: String,
    val number: String
)