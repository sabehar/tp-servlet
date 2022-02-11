/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.tpservlet.jpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sabehar
 */
public class Ligne {
    private final String lettre;
    private List<StationTrain> stations;

    public Ligne(String lettre) {
        this.lettre = lettre;
        stations = new ArrayList<>();
    }
  
    public Collection<StationTrain> getStations() {
        return Collections.unmodifiableCollection(stations);
    }

    public void setStations(List<StationTrain> stations) {
        this.stations = stations;
    }

    public String getLettre() {
        return lettre;
    }
   
    public void addStation(StationTrain s) {
        stations.add(s);
    }
    
}
