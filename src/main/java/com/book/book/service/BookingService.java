package com.book.book.service;

import com.book.bookentity.Booking;
import com.book.bookrepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    // some booking service methods

    // get all bookings booked by a customer with matching phone number and books written by a given list of authors
    public List<Booking> getAllBy(String phone, List<String> authors) {
    return bookingRepository.queryBy(phone, authors);
    }

    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }
}