package com.quickstart.user.usecase

import com.quickstart.user.ports.primary.GetUserPort
import com.quickstart.user.ports.secondary.UserDataAccessPort
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetUserUseCase(
    private val userDataAccessPort: UserDataAccessPort
) : GetUserPort {
    override fun byId(id: Long) = userDataAccessPort.findById(id)

    override fun all() = userDataAccessPort.findAll()
}