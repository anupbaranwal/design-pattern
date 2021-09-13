package com.cleancoder.structural.implementor;

import com.cleancoder.structural.entitry.BaseEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DatabaseRepository implements StorageRepository {

  @Override
  public void store(BaseEntity entity) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    try {
      entityTransaction.begin();
      entityManager.persist(entity);
      entityTransaction.commit();
    } catch (Exception ex) {
      if (entityTransaction.isActive()) {
        entityTransaction.rollback();
      }
    }
  }
}
