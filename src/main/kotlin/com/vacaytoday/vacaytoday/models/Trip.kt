package com.vacaytoday.vacaytoday.models

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Table(name = "trip")
class Trip {
    @Id
    @GeneratedValue
    val id : Long = 0

    @Column(name = "title", nullable = false)
    var title : String = ""

    @Column(name = "overview", nullable = true)
    var overview : String = ""

    @Column(name = "start_date", nullable = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    var startDate : Date? = null

    @Column(name = "end_date", nullable = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    var endDate : Date? = null

    @CreationTimestamp
    val createAt : Date? = null

    @UpdateTimestamp
    var updatedAt : Date? = null
}