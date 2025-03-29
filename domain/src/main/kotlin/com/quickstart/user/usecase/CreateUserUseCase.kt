package com.quickstart.user.usecase

import com.quickstart.user.model.UserToCreate
import com.quickstart.user.ports.primary.CreateUserPort
import com.quickstart.user.ports.secondary.PublisherUserPort
import com.quickstart.user.ports.secondary.UserDataAccessPort
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
internal class CreateUserUseCase(
    private val publisherUserPort: PublisherUserPort,
    private val userDataAccessPort: UserDataAccessPort
) : CreateUserPort {
    override fun invoke(userToCreate: UserToCreate)  = userDataAccessPort.save(userToCreate)
        .also { publisherUserPort(it) }
}