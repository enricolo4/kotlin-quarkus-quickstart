package com.quickstart.user.dbo

import com.quickstart.shared.BaseDBO
import com.quickstart.user.model.User
import com.quickstart.user.model.UserToCreate
import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import jakarta.persistence.PrimaryKeyJoinColumn

@Entity(name = "users")
class UserDBO : BaseDBO() {
    @Id
    @Tsid
    @Column
    var id: Long? = null
    lateinit var name: String
    lateinit var email: String
    lateinit var cpf: String

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER, cascade = [CascadeType.ALL], orphanRemoval = true)
    @PrimaryKeyJoinColumn
    lateinit var address: UserAddressDBO

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER, cascade = [CascadeType.ALL], orphanRemoval = true)
    @PrimaryKeyJoinColumn
    lateinit var phone: UserPhoneDBO

    fun toModel() = User(
        id = id!!,
        name = name,
        email = email,
        cpf = cpf,
        address = address.toModel(),
        phone = phone.toModel()
    )
}

fun UserToCreate.toDBO() = UserDBO().apply {
    name = this@toDBO.name
    email = this@toDBO.email
    cpf = this@toDBO.cpf
    address = this@toDBO.address.toDBO(this)
    phone = this@toDBO.phone.toDBO(this)
}