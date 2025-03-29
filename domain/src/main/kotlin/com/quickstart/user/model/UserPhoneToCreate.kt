package com.quickstart.user.model

data class UserPhoneToCreate(
    val countryCode: String,
    val areaCode: String,
    val number: String
)
