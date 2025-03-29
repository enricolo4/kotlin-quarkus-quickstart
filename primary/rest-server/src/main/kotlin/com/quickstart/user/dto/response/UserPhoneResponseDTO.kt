package com.quickstart.user.dto.response

import com.quickstart.user.model.UserPhone

data class UserPhoneResponseDTO(
    val countryCode: String,
    val areaCode: String,
    val number: String
)

fun UserPhone.toResponseDTO() = UserPhoneResponseDTO(
    countryCode = countryCode,
    areaCode = areaCode,
    number = number
)
