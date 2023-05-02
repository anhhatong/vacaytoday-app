package com.vacaytoday.vacaytoday.repository

import com.vacaytoday.vacaytoday.models.Trip
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TripRepository : JpaRepository<Trip, Long> {}