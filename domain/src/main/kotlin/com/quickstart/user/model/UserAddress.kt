package com.quickstart.user.model

data class UserAddress(
    val id: Long,
    val country: String,
    val state: String,
    val city: String,
    val address: String,
    val buildNumber: String,
    val complement: String? = null,
    val neighborhood: String,
    val zipCode: String
)
