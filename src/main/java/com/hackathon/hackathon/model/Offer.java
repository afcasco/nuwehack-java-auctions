package com.hackathon.hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Offer {
    private String itemName;
    private double amount;
    private Bidder bidder;

}
