package com.quickstart.user.ports.secondary

import com.quickstart.user.model.User

interface PublisherUserPort {
    operator fun invoke(user: User)
}