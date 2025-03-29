package com.quickstart.user.dto.response

import com.quickstart.user.model.UserAddress

data class UserAddressResponseDTO(
    val country: String,
    val state: String,
    val city: String,
    val address: String,
    val buildNumber: String,
    val complement: String?,
    val neighborhood: String,
    val zipCode: String
)

fun UserAddress.toResponseDTO() = UserAddressResponseDTO(
    country = country,
    state = state,
    city = city,
    address = address,
    buildNumber = buildNumber,
    complement = complement,
    neighborhood = neighborhood,
    zipCode = zipCode
)
