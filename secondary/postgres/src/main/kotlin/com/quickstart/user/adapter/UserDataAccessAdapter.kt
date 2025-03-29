package com.quickstart.user.adapter

import com.quickstart.user.dbo.toDBO
import com.quickstart.user.model.UserToCreate
import com.quickstart.user.ports.secondary.UserDataAccessPort
import com.quickstart.user.repository.UserRepository
import io.quarkus.panache.common.Sort
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional

@ApplicationScoped
internal class UserDataAccessAdapter(
    private val userRepository: UserRepository
) : UserDataAccessPort {
    @Transactional
    override fun save(userToCreate: UserToCreate) = userToCreate.toDBO()
        .also { userRepository.persistAndFlush(it) }
        .toModel()

    override fun findById(id: Long) = userRepository.findById(id)?.toModel()

    override fun findAll() = userRepository.listAll(Sort.by("id")).map { it.toModel() }
}