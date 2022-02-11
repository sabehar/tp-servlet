/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.tpservlet.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author sabehar
 */
@Entity
@Table(name = "ligne")
public class Ligne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "ligne")
    private List<StationTrain> stations;

    public Ligne() {
    }

    public Ligne(int numero) {
        this.numero = numero;
        stations = new ArrayList<>();
    }
  
    public List<StationTrain> getStations() {
        return Collections.unmodifiableList(stations);
    }

    public void setStations(List<StationTrain> stations) {
        this.stations = stations;
    }

    public int getNumero() {
        return numero;
    }
   
    public void addStation(StationTrain s) {
        stations.add(s);
    }
    
}
