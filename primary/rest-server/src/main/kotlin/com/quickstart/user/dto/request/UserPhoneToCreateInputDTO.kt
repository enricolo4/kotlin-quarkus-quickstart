package com.quickstart.user.dto.request

import com.quickstart.user.model.UserPhoneToCreate

data class UserPhoneToCreateInputDTO(
    val countryCode: String,
    val areaCode: String,
    val number: String
) {
    fun toModel() = UserPhoneToCreate(
        countryCode = countryCode,
        areaCode = areaCode,
        number = number
    )
}
