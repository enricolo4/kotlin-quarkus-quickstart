package com.quickstart.user.dto.request

import com.quickstart.user.model.UserAddressToCreate

data class UserAddressToCreateInputDTO(
    val country: String,
    val state: String,
    val city: String,
    val address: String,
    val buildNumber: String,
    val complement: String?,
    val neighborhood: String,
    val zipCode: String
) {
    fun toModel() = UserAddressToCreate(
        country = country,
        state = state,
        city = city,
        address = address,
        buildNumber = buildNumber,
        complement = complement,
        neighborhood = neighborhood,
        zipCode = zipCode
    )

}


