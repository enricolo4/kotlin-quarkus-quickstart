package com.quickstart.user.repository

import com.quickstart.user.dbo.UserDBO
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : PanacheRepository<UserDBO> {
    fun findByName(name: String) = list("name", name)
    fun findByEmail(email: String) = list("email", email)
}