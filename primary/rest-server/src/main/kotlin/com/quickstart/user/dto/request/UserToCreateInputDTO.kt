package com.quickstart.user.dto.request

import com.quickstart.user.model.UserToCreate

data class UserToCreateInputDTO(
    val name: String,
    val email: String,
    val cpf: String,
    val address: UserAddressToCreateInputDTO,
    val phone: UserPhoneToCreateInputDTO
) {
    fun toModel() = UserToCreate(
        name = name,
        email = email,
        cpf = cpf,
        address = address.toModel(),
        phone = phone.toModel()
    )
}
