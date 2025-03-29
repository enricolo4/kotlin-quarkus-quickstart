package com.quickstart.user.model

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val cpf: String,
    val address: UserAddress,
    val phone: UserPhone
)
