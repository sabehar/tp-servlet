/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.repository;

import com.iut.tpservlet.jpa.Ligne;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Sami
 */
public class LigneRepository extends Repository<Ligne, Integer> {

    public LigneRepository() {
    }

    public LigneRepository(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<Ligne> getAll() {
        return entityManager
            .createQuery("SELECT line FROM TrainLine line ORDER BY line.name", Ligne.class)
            .getResultList();
    }

    @Override
    public Ligne getById(Integer id) {
        return entityManager.find(Ligne.class, id);
    }
}
