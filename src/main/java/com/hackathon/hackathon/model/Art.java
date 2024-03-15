package com.hackathon.hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Para el desarrollo de la prueba:
 * - Se debe incluir la clase Art como hija de la clase Item
 * - Se debe incluir la implementación del constructor public Art(String name, double initialPrice, Bidder currentBidder, String type, String artist, int yearCreated)
 * - Se deben incluir los métodos getter y setter de la clase Art
 */
@AllArgsConstructor
@Getter
@Setter
public class Art extends Item{

    private String name;
    private double initialPrice;
    private Bidder currentBidder;
    private String type;
    private String artist;
    private int yearCreated;


    public Art(String name, double initialPrice, double highestOffer, Bidder currentBidder, String type) {
        super(name, initialPrice, highestOffer, currentBidder, type);
    }
}
