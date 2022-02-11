/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.tpservlet.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author Sami
 */
@Entity
@IdClass(CompositeKey.class)
public class Voyage implements Serializable {
    @Id
    private StationTrain depart;
    @Id
    private StationTrain arrivee;
    private int prix;

    public Voyage() {
    }

    public Voyage(StationTrain depart, StationTrain arrivee, int prix) {
        this.depart = depart;
        this.arrivee = arrivee;
        prix = depart.getPrix() + arrivee.getPrix();
    }
    
}
