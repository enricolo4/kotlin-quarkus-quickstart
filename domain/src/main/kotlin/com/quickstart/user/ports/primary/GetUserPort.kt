package com.quickstart.user.ports.primary

import com.quickstart.user.model.User

interface GetUserPort {
    fun byId(id: Long): User?
    fun all(): List<User>
}