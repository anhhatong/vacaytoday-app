package com.vacaytoday.vacaytoday.controller

import com.vacaytoday.vacaytoday.models.Trip
import com.vacaytoday.vacaytoday.services.TripService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/v1/api")
class TripController {

    @Autowired
    lateinit var tripService: TripService

    @PostMapping("/trips")
    fun createTrip(@Valid @RequestBody aTrip: Trip) : Trip {
        return tripService.createTrip(aTrip)
    }

    @GetMapping("/trips/{id}")
    fun findTrip(@PathVariable("id") tripId: Long) : Trip? {
        return tripService.findTrip(tripId)
    }

    @GetMapping("/trips")
    fun findAllTrips() : List<Trip>? {
        return tripService.findAllTrips()
    }

    @DeleteMapping("/trips/{id}")
    fun deleteTrip(@PathVariable("id") tripId: Long) : ResponseEntity<Map<String, String>> {
        return tripService.deleteTrip(tripId)
    }
}