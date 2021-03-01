package com.phellipe.rodrigues.ddd_hecagonal.application.controller

import com.phellipe.rodrigues.ddd_hecagonal.domain.entities.User
import com.phellipe.rodrigues.ddd_hecagonal.domain.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun getAll() : List<User>{
        return userService.getAll()
    }
}