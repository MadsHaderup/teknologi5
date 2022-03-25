package com.example.obg.controller;

import com.example.obg.model.Booking;
import com.example.obg.model.Showing;
import com.example.obg.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin

public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    //@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/booking")
    @ResponseStatus(HttpStatus.CREATED)
    public Booking postBooking(@RequestBody Booking booking) {
        //long totalbookings = bookingRepository.sumOfBookings(booking.getShowing().getShowingID());
        System.out.println("booking is = " + booking.getBookingID());
        //System.out.println(totalbookings);
        return bookingRepository.save(booking);

    }
}
