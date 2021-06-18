package com.peregud.multipletables.util;

import lombok.experimental.UtilityClass;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class DataUtil {

    public <T> void saveData(List<T> list) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            list.forEach(entityManager::merge);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    public <T> List<?> getAll(String entityName) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        List<?> list = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            list = entityManager
                    .createQuery("FROM " + entityName)
                    .getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return list;
    }
}
