package com.vacaytoday.vacaytoday.dto

import org.springframework.web.server.ResponseStatusException

class ApiException(code: Int, message: String) : ResponseStatusException(code, message, null)

data class LoginResponseDto(
        val username: String,
        val email: String,
        val token: String,
)