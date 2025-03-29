package com.quickstart.user.controller

import com.quickstart.user.dto.request.UserToCreateInputDTO
import com.quickstart.user.dto.response.toUsersResponse
import com.quickstart.user.dto.response.toUsersResponseDTO
import com.quickstart.user.ports.primary.CreateUserPort
import com.quickstart.user.ports.primary.GetUserPort
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.POST

@Path("/users")
class UserController (
    private val createUserPort: CreateUserPort,
    private val getUserPort: GetUserPort
) {
    @POST
    fun create(userToCreateInputDTO: UserToCreateInputDTO) = createUserPort(userToCreateInputDTO.toModel())
        .toUsersResponseDTO()

    @GET
    @Path("{id}")
    fun getById(id: Long) = getUserPort.byId(id)
        ?.toUsersResponseDTO()

    @GET
    fun getAll() = getUserPort.all().toUsersResponse()
}