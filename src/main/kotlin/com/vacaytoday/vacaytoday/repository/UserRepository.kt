package com.vacaytoday.vacaytoday.repository

import com.vacaytoday.vacaytoday.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    override fun getReferenceById(userId: Long): User

    fun findByUsername(username: String): User?

    fun existsByUsername(username: String): Boolean

    fun existsByEmail(email: String): Boolean

    fun save(user: User) : User
}