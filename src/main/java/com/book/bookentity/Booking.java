package com.book.bookentity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private int id;


    @Column(name = "book_id", columnDefinition = "int")
    private int bookId;


    @Column(name = "customer_id", columnDefinition = "int")
    private int customerId;

    @Column(name = "issue_date", columnDefinition = "DATETIME")
    private String issueDate;

    @Column(name = "return_date", columnDefinition = "DATETIME")
    private String returnDate;

    // getters and setters

    public Booking() {}

    public Booking(int bookId, int customerId, String issueDate) {
        this.bookId = bookId;
        this.customerId = customerId;
        this.issueDate = issueDate;
    }
}