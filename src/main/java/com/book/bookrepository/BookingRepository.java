package com.book.bookrepository;

import com.book.bookentity.Booking;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    // some booking repository methods

    @Query(value = "SELECT * FROM bookings bs WHERE " +
            "EXISTS (SELECT 1 FROM customer c WHERE bs.customer_id = c.id AND c.phone = :phone) " +
            "AND EXISTS (SELECT 1 FROM books b WHERE b.id = bs.book_id AND b.author IN :authors)"
            )
    List<Booking> queryBy(@Param("phone") String phone,
                          @Param("authors") List<String> authors);
}
