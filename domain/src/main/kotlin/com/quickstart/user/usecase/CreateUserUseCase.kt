package com.quickstart.user.usecase
import com.quickstart.user.model.User
import com.quickstart.user.model.UserToCreate
import com.quickstart.user.ports.primary.CreateUserPort
import jakarta.enterprise.context.ApplicationScoped
import kotlin.random.Random

@ApplicationScoped
class CreateUserUseCase : CreateUserPort {
    override fun invoke(userToCreate: UserToCreate) = User(
        id = Random.nextLong(),
        name = userToCreate.name,
        email = userToCreate.email
    )
}