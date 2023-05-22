package com.vacaytoday.vacaytoday.dto

data class LoginDto(
        val username: String,
        val password: String,
)

data class RegisterDto(
        val username: String,
        val password: String,
        val email: String
)