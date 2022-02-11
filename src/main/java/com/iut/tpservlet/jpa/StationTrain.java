/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iut.tpservlet.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 *
 * @author sabehar
 */
@Entity
@Table(name = "station_train")
public class StationTrain implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "nom", nullable = false)
    private String name;
    
    @Column(name = "prix", nullable = false)
    private int price;
    
    @Column(name = "position", nullable = false)
    private int position;

    @PrimaryKeyJoinColumn(name = "position")
    @ManyToOne(optional = false)
    private Ligne ligne;
    
    
    public StationTrain(int id, String name, int price, Ligne ligne) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ligne = ligne;
        if (ligne.getStations().isEmpty()) {
            position = 1;
        } else {
            position = ligne.getStations().size() + 1;
        }
    }

    public StationTrain() {
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrix() {
        return price;
    }

    public void setPrix(int price) {
        this.price = price;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
    @Override
    public String toString() {
        return "Station [id=" + getId() + ", Ville=" + getName() +
               ", Ligne=" + ligne.getNumero() + ", Prix=" + getPrix() + "]";
    }
    
}
