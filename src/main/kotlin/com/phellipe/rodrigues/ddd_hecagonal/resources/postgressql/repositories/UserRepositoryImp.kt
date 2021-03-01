package com.phellipe.rodrigues.ddd_hecagonal.resources.postgressql.repositories

import com.phellipe.rodrigues.ddd_hecagonal.domain.entities.User
import com.phellipe.rodrigues.ddd_hecagonal.domain.repositories.UserRepository
import com.phellipe.rodrigues.ddd_hecagonal.resources.postgressql.entities.toUser
import com.phellipe.rodrigues.ddd_hecagonal.resources.postgressql.repositories.infrastructure.PostgreDBUserRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class UserRepositoryImp(private val postgreDBUserRepository: PostgreDBUserRepository) : UserRepository{
    override fun getAll(): List<User> {
        val users = ArrayList<User>()
        postgreDBUserRepository.findAll().map {
            users.add(it.toUser())
        }
        return users
    }
}