package com.phellipe.rodrigues.ddd_hecagonal.resources.postgressql.repositories.infrastructure

import com.phellipe.rodrigues.ddd_hecagonal.resources.postgressql.entities.UserDO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostgreDBUserRepository : JpaRepository<UserDO, Int>