package com.vacaytoday.vacaytoday.services

import com.vacaytoday.vacaytoday.models.User
import com.vacaytoday.vacaytoday.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository
    fun findUserById(userId: Long) : User? {
        return userRepository.getReferenceById(userId)
    }

    fun findByUsername(username: String): User? {
        return userRepository.findByUsername(username)
    }

    fun existsByUsername(username: String): Boolean {
        return userRepository.existsByUsername(username)
    }

    fun existsByEmail(email: String): Boolean {
        return userRepository.existsByEmail(email)
    }

    fun save(user: User) : User {
        return userRepository.save(user)
    }
}