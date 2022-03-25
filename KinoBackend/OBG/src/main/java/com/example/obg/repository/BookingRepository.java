package com.example.obg.repository;

import com.example.obg.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    @Query("SELECT COUNT(b) FROM Booking b WHERE b.showing.showingID = :showingID")
    long countBookingByNoOfPeople(int showingID);
}
