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
public class Voyage implements Serializable {
    
    @Id
    private int id;
    private StationTrain depart;
    private StationTrain arrivee;
    private int prix;

    public Voyage() {
    }

    public Voyage(int numero, StationTrain depart, StationTrain arrivee, int prix) {
        this.id = numero;
        this.depart = depart;
        this.arrivee = arrivee;
        prix = depart.getPrix() + arrivee.getPrix();
    }
    
//    private int calculPrixVoyage(StationTrain d, StationTrain a) {
//        int prix = 0;
//        // Si les deux stations sont sur la même ligne
//        if (d.getLigne() == a.getLigne()) {
//            // Si la station de départ est plus loin (de la gare centrale) que la station d'arrivée
//            if (d.getPosition() > a.getPosition()) {
//                // On récupère toutes gares entre les deux gares (gare d'arrivée incluse)
//                List<StationTrain> lesStations = getStationTrainBetweenTwoStationTrain(d.getLigne(), d.getPosition(), a.getPosition());
//                // On parcourt et on additionne leur prix
//                for(StationTrain s : lesStations){
//                    prix += s.getPrix();
//                }
//            }
//        }
//        return prix;
//    }

//    public List<StationTrain> getStationTrainByLigne(Ligne ligne) {
//        Query query = this.getEntityManager().createQuery("SELECT * FROM StationTrain WHERE ligne = " + ligne);
//        return query.getResultList();
//    }
//
//    public List<StationTrain> getStationTrainBetweenTwoStationTrain(Ligne ligne, int positionDepart, int positionArrivee) {
//        Query query = this.getEntityManager().createQuery("SELECT * FROM StationTrain WHERE ligne = " + ligne + " AND position > " + positionDepart + " AND position <= " + positionArrivee);
//        return query.getResultList();
//    }
    
    
}
