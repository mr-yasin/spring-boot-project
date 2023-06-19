package com.book.bookentity;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author")
    private String author;

    // getters and setters

    public Book() {}

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
}