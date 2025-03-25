package com.quickstart.user.usecase

import com.quickstart.user.model.User
import com.quickstart.user.model.UserToCreate
import com.quickstart.user.ports.primary.CreateUserPort
import com.quickstart.user.ports.secondary.PublisherUserPort
import jakarta.enterprise.context.ApplicationScoped
import kotlin.random.Random

@ApplicationScoped
class CreateUserUseCase(
    private val publisherUserPort: PublisherUserPort
) : CreateUserPort {
    override fun invoke(userToCreate: UserToCreate) = User(
        id = Random.nextLong(),
        name = userToCreate.name,
        email = userToCreate.email
    ).also { publisherUserPort(it) }
}