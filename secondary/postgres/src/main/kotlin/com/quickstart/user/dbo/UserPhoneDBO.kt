package com.quickstart.user.dbo

import com.quickstart.shared.BaseDBO
import com.quickstart.user.model.UserPhone
import com.quickstart.user.model.UserPhoneToCreate
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.MapsId
import jakarta.persistence.OneToOne

@Entity(name = "user_phones")
class UserPhoneDBO : BaseDBO() {
    @Id
    @Tsid
    @Column(name = "user_id")
    var id: Long? = null
    lateinit var countryCode: String
    lateinit var areaCode: String
    lateinit var number: String
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    lateinit var user: UserDBO

    fun toModel() = UserPhone(
        id = id!!,
        countryCode = countryCode,
        areaCode = areaCode,
        number = number
    )
}

fun UserPhoneToCreate.toDBO(userDBO: UserDBO) = UserPhoneDBO().apply {
    countryCode = this@toDBO.countryCode
    areaCode = this@toDBO.areaCode
    number = this@toDBO.number
    user = userDBO
}