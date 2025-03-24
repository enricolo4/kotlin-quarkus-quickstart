package com.quickstart.user.dto.response

import com.quickstart.user.model.User

data class UserResponseDTO(
    val id: Long,
    val name: String,
    val email: String
)

fun User.toUserResponseDTO() = UserResponseDTO(
    id = id,
    name = name,
    email = email
)