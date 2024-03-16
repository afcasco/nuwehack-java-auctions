package com.hackathon.hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Art extends Item {

    private String name;
    private double initialPrice;
    private Bidder currentBidder;
    private String type;
    private String artist;
    private int yearCreated;
}