package com.book.bookentity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "book_id")
    private int bookId;


    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "issue_date")
    private String issueDate;

    @Column(name = "return_date")
    private String returnDate;

    // getters and setters

    public Booking() {}

    public Booking(int bookId, int customerId, String issueDate) {
        this.bookId = bookId;
        this.customerId = customerId;
        this.issueDate = issueDate;
    }
}