package com.vacaytoday.vacaytoday.controller

import com.vacaytoday.vacaytoday.dto.ApiException
import com.vacaytoday.vacaytoday.dto.LoginDto
import com.vacaytoday.vacaytoday.dto.LoginResponseDto
import com.vacaytoday.vacaytoday.dto.RegisterDto
import com.vacaytoday.vacaytoday.models.User
import com.vacaytoday.vacaytoday.services.HashService
import com.vacaytoday.vacaytoday.services.TokenService
import com.vacaytoday.vacaytoday.services.UserService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/auth")
class AuthController {

    @Autowired
    lateinit var hashService: HashService
    @Autowired
    lateinit var  tokenService: TokenService
    @Autowired
    lateinit var userService: UserService
    @PostMapping("/login")
    fun login(@Valid @RequestBody payload: LoginDto): LoginResponseDto {
        val user = userService.findByUsername(payload.username) ?: throw ApiException(400, "Login failed")

        if (!hashService.checkBcrypt(payload.password, user.getPassword())) {
            throw ApiException(400, "Login failed")
        }

        return LoginResponseDto(
                username = user.getUsername(),
                email = user.getEmail(),
                token = tokenService.createToken(user),
        )
    }

    @PostMapping("/register")
    fun register(@RequestBody payload: RegisterDto): LoginResponseDto {
        if (userService.existsByEmail(payload.email)) {
            throw ApiException(400, "Email already exists")
        }

        if (userService.existsByUsername(payload.username)) {
            throw ApiException(400, "Name already exists")
        }

        val user = User(
                username = payload.username,
                password = hashService.hashBcrypt(payload.password),
                email = payload.email
        )

        val savedUser = userService.save(user)

        return LoginResponseDto(
                username = savedUser.getUsername(),
                email = savedUser.getEmail(),
                token = tokenService.createToken(savedUser),
        )
    }
}