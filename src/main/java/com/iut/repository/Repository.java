/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.repository;

/**
 *
 * @author Sami
 */
import java.io.Closeable;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class Repository<TEntity extends Serializable, TId> implements Closeable {

    protected final EntityManager entityManager;

    public Repository() {
        entityManager = Persistence.createEntityManagerFactory("persistence_unit").createEntityManager();
    }

    public Repository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract List<TEntity> getAll();
    public abstract TEntity getById(TId id);
//    public abstract TId create(TEntity entity);
//    public abstract void delete(TEntity entity);

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void detach(TEntity entity) {
        entityManager.detach(entity);
    }

    public boolean isManaged(TEntity entity) {
        return entityManager.contains(entity);
    }

    public void refresh(TEntity entity) {
        entityManager.refresh(entity);
    }
    public void flush() {
        entityManager.flush();
    }

    @Override
    public void close() {
        if (entityManager.isOpen())
            entityManager.close();
    }
}
