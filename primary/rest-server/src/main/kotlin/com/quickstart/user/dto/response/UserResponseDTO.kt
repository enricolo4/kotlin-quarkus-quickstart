package com.quickstart.user.dto.response

import com.quickstart.user.model.User

data class UsersResponseDTO(
    val nextUrl: String?,
    val hasNext: Boolean,
    val count: Int,
    val users: List<UserResponseDTO>
)

data class UserResponseDTO(
    val id: Long,
    val name: String,
    val email: String,
    val cpf: String
)

fun List<User>.toUsersResponse() = UsersResponseDTO(
    nextUrl = null,
    hasNext = false,
    count = size,
    users = map { it.toUserResponseDTO() }

)

fun User.toUsersResponseDTO() = UsersResponseDTO(
    nextUrl = null,
    hasNext = false,
    count = 1,
    users = listOf(toUserResponseDTO())
)

private fun User.toUserResponseDTO() = UserResponseDTO(
    id = id,
    name = name,
    email = email,
    cpf = cpf
)