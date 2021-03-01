package com.phellipe.rodrigues.ddd_hecagonal.domain.services

import com.phellipe.rodrigues.ddd_hecagonal.domain.entities.User
import com.phellipe.rodrigues.ddd_hecagonal.domain.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAll(): List<User>{
        return userRepository.getAll();
    }
}