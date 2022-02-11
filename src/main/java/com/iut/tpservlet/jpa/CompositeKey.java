/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.tpservlet.jpa;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sami
 */
public class CompositeKey implements Serializable {
    private StationTrain arrivee;
    private StationTrain depart;

    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) {
			return true;
		}
		if ( obj == null || getClass() != obj.getClass() ) {
			return false;
		}
		CompositeKey pk = (CompositeKey) obj;
		return Objects.equals( arrivee, pk.arrivee ) &&
				Objects.equals( depart, pk.depart );
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivee, depart);
    }
    
    
}