package com.vacaytoday.vacaytoday.services

import com.vacaytoday.vacaytoday.exceptions.DataNotFoundException
import com.vacaytoday.vacaytoday.models.Trip
import com.vacaytoday.vacaytoday.repository.TripRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class TripService {

    @Autowired
    lateinit var tripRepository: TripRepository

    fun createTrip(aTrip: Trip) : Trip {
        return tripRepository.save(aTrip)
    }

    fun findTrip(tripId: Long) : Trip? {
        val aTripOptional: Optional<Trip> = tripRepository.findById(tripId)
        return if (aTripOptional.isPresent) aTripOptional.get() else null
    }

    fun findAllTrips() : List<Trip>? {
        return tripRepository.findAll()
    }

    fun deleteTrip(tripId: Long) : ResponseEntity<Map<String, String>> {
        return try {
            if (!tripRepository.existsById(tripId))
                throw DataNotFoundException("Delete error: Trip $tripId does not exist")

            tripRepository.deleteById(tripId)
            val dataMessage: MutableMap<String, String> = HashMap()
            dataMessage["data"] = "Trip $tripId was deleted"
            ResponseEntity.ok(dataMessage)
        } catch (e: EmptyResultDataAccessException) {
            throw DataNotFoundException("Delete error: Trip $tripId does not exist")
        } catch (e: Exception) {
            throw e
        }
    }

}