package com.hackathon.hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {
    private String name;
    private double initialPrice;
    private double highestOffer; // Inicializar la oferta máxima en 0.0
    private Bidder currentBidder; 
    private String type;


    public Item(String name, double initialPrice, Bidder currentBidder, String type) {
        this.name = name;
        this.initialPrice = initialPrice;
        this.highestOffer = 0.0;
        this.currentBidder = currentBidder;
        this.type = type;
    }
}
