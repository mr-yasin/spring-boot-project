package com.book.bookcontroller;

import com.book.book.service.BookingService;
import com.book.bookentity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    BookingService bookingService;

    // some booking apis which return Booking objects

    @GetMapping
    public List<Booking> getAllBookingsBy(@RequestParam("phone") String phone,
                                         @RequestParam("authors") List<String> authors) {
        return bookingService.getAllBy(phone, authors);
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        bookingService.saveBooking(booking);
        return booking;
    }
}