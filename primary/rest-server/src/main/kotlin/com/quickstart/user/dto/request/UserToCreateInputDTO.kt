package com.quickstart.user.dto.request

import com.quickstart.user.model.UserToCreate

data class UserToCreateInputDTO(
    val name: String,
    val email: String
) {
    fun toModel() = UserToCreate(
        name = name,
        email = email
    )
}
