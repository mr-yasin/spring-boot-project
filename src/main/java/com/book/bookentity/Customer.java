package com.book.bookentity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "customer", uniqueConstraints = {@UniqueConstraint(columnNames = {"phone"})})
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "registered")
    private String registered;

    // getters and setters

    public Customer() {}

    public Customer(String name, String phone, String registered) {
        this.name = name;
        this.phone = phone;
        this.registered = registered;
    }
}