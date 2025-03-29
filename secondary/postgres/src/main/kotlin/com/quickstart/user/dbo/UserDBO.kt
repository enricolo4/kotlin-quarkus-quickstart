package com.quickstart.user.dbo

import com.quickstart.shared.BaseDBO
import com.quickstart.user.model.User
import com.quickstart.user.model.UserToCreate
import jakarta.persistence.Entity

@Entity(name = "users")
class UserDBO : BaseDBO() {
    lateinit var name: String
    lateinit var email: String
    lateinit var cpf: String

    fun toModel() = User(
        id = id!!,
        name = name,
        email = email,
        cpf = cpf
    )
}

fun UserToCreate.toDBO() = UserDBO().apply {
    name = this@toDBO.name
    email = this@toDBO.email
    cpf = this@toDBO.cpf
}