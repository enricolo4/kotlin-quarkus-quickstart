package com.quickstart.user.model

data class UserToCreate(
    val name: String,
    val email: String,
    val cpf: String,
    val address: UserAddressToCreate,
    val phone: UserPhoneToCreate
)
