package com.hackathon.hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Book extends Item {
    // Getters y Setters
    private String author;
    private int yearPublished;

    public Book(String name, double initialPrice, Bidder currentBidder, String type, String author, int yearPublished) {
        super(name, initialPrice, currentBidder, type);
        this.author = author;
        this.yearPublished = yearPublished;
    }

}