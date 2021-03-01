package com.phellipe.rodrigues.ddd_hecagonal.domain.repositories

import com.phellipe.rodrigues.ddd_hecagonal.domain.entities.User
import org.springframework.stereotype.Component

@Component
interface UserRepository {
    fun getAll(): List<User>
}