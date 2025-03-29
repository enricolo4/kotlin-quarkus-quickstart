package com.quickstart.user.ports.secondary

import com.quickstart.user.model.User
import com.quickstart.user.model.UserToCreate

interface UserDataAccessPort {
    fun save(userToCreate: UserToCreate): User
    fun findById(id: Long): User?
    fun findAll(): List<User>
}