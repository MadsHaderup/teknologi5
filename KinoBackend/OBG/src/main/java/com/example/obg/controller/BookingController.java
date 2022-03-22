package com.example.obg.controller;

import com.example.obg.model.Booking;
import com.example.obg.model.Showing;
import com.example.obg.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin

public class BookingController {

    @Autowired
    BookingRepository bookingRepository;


    @PostMapping("/booking")
    @ResponseStatus(HttpStatus.CREATED)
    public Booking postShowing(@RequestBody Booking booking) {
        System.out.println("booking is = " + booking.getBookingID());
        return bookingRepository.save(booking);
    }
}
