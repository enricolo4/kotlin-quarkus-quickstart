package com.quickstart.user.controller

import com.quickstart.user.dto.request.UserToCreateInputDTO
import com.quickstart.user.ports.primary.CreateUserPort
import jakarta.ws.rs.Path
import jakarta.ws.rs.POST

@Path("/users")
class UserController (
    private val createUserPort: CreateUserPort
) {
    @POST
    fun create(userToCreateInputDTO: UserToCreateInputDTO) = createUserPort(userToCreateInputDTO.toModel())
}