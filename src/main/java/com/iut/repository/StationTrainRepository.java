/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.repository;

import com.iut.tpservlet.jpa.StationTrain;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Sami
 */
public class StationTrainRepository extends Repository<StationTrain, Integer> {
    public StationTrainRepository() {
    }

    public StationTrainRepository(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<StationTrain> getAll() {
        return entityManager
            .createQuery("SELECT station FROM station_train station ORDER BY station.name", StationTrain.class)
            .getResultList();
    }

    public List<StationTrain> getAllByLineId(Integer lineId) {
        return entityManager
                .createQuery(
                "SELECT station FROM station_train station WHERE station.trainLineId = :trainLineId ORDER BY station.name",
                    StationTrain.class
                )
                .setParameter("trainLineId", lineId)
                .getResultList();
    }

    @Override
    public StationTrain getById(Integer id) {
        return entityManager.find(StationTrain.class, id);
    }
}
