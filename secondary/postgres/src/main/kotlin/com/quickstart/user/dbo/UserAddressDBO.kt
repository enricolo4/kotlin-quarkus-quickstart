package com.quickstart.user.dbo

import com.quickstart.shared.BaseDBO
import com.quickstart.user.model.UserAddress
import com.quickstart.user.model.UserAddressToCreate
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.MapsId
import jakarta.persistence.OneToOne

@Entity(name = "user_addresses")
class UserAddressDBO : BaseDBO() {
    @Id
    @Tsid
    @Column(name = "user_id")
    var id: Long? = null
    lateinit var country: String
    lateinit var state: String
    lateinit var city: String
    lateinit var address: String
    lateinit var buildNumber: String
    var complement: String? = null
    lateinit var neighborhood: String
    lateinit var zipCode: String
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    lateinit var user: UserDBO

    fun toModel() = UserAddress(
        id = id!!,
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

fun UserAddressToCreate.toDBO(userDBO: UserDBO) = UserAddressDBO().apply{
    country = this@toDBO.country
    state = this@toDBO.state
    city = this@toDBO.city
    address = this@toDBO.address
    buildNumber = this@toDBO.buildNumber
    complement = this@toDBO.complement
    neighborhood = this@toDBO.neighborhood
    zipCode = this@toDBO.zipCode
    user = userDBO
}