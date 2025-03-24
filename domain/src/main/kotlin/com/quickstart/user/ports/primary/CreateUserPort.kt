package com.quickstart.user.ports.primary

import com.quickstart.user.model.User
import com.quickstart.user.model.UserToCreate

interface CreateUserPort {
    operator fun invoke(userToCreate: UserToCreate): User
}