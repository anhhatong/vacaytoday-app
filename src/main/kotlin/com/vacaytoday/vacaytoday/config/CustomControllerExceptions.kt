package com.vacaytoday.vacaytoday.config

import com.vacaytoday.vacaytoday.exceptions.DataNotFoundException
import com.vacaytoday.vacaytoday.models.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.lang.Exception

@ControllerAdvice
class CustomControllerExceptions {

    @ExceptionHandler(Exception::class)
    fun handleExceptions(e: Exception) : ResponseEntity<ErrorResponse> {
        val status = HttpStatus.INTERNAL_SERVER_ERROR
        return ResponseEntity<ErrorResponse>(
                ErrorResponse(status, e.message),
                status
        )
    }

    @ExceptionHandler(DataNotFoundException::class)
    fun handleDataNotFoundException(e: Exception) : ResponseEntity<ErrorResponse> {
        val status = HttpStatus.NOT_FOUND
        return ResponseEntity<ErrorResponse>(
                ErrorResponse(status, e.message),
                status
        )
    }
}