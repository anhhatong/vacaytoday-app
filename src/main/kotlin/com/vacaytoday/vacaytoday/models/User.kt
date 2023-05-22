package com.vacaytoday.vacaytoday.models

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.annotations.CreationTimestamp
import java.util.*

@Entity
@Table(name = "users")
class User (username: String = "", password: String = "", email: String = "") {
    @Id
    @GeneratedValue
    private var id : Long = 0

    @Column(name = "username", nullable = false, unique = true)
    private var username :  @NotBlank @Size(max = 20) String = ""

    @Email
    @Column(name = "email", nullable = false, unique = true)
    private var email: @NotBlank @Size(max = 50) String = ""

    @Column(name = "password", nullable = false)
    private var password: @NotBlank @Size(min = 8, max = 120) String = ""

    @CreationTimestamp
    private val createAt : Date? = null

    init {
        this.username = username
        this.password = password
        this.email = email
    }

    fun getId(): Long {
        return id
    }

    fun setId(id: Long) {
        this.id = id
    }

    fun getUsername(): String {
        return username
    }

    fun setUsername(username: String) {
        this.username = username
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getPassword(): String {
        return password
    }

    fun setPassword(password: String) {
        this.password = password
    }
}