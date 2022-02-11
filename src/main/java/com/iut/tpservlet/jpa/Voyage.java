/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.tpservlet.jpa;

/**
 *
 * @author Sami
 */
public class Voyage {
    private StationTrain depart;
    private StationTrain arrivee;
    private int prix;

    public Voyage(StationTrain depart, StationTrain arrivee, int prix) {
        this.depart = depart;
        this.arrivee = arrivee;
        prix = depart.getPrice() + arrivee.getPrice();
    }
    
}
