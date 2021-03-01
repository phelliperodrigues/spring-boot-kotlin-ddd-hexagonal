package com.phellipe.rodrigues.ddd_hecagonal.resources.postgressql.entities

import com.phellipe.rodrigues.ddd_hecagonal.domain.entities.User
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class UserDO(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var username: String,
    var name: String,
    var email: String
)

fun UserDO.toUser() = User(
    username = username,
    name = name,
    email = email
)