package com.peregud.clientvalidation.util;

import com.peregud.clientvalidation.model.Applicant;
import lombok.experimental.UtilityClass;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class DBUtil {

    public Applicant save(Applicant applicant) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(applicant);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return applicant;
    }

    public List<?> getAll() {
        EntityManager entityManager = com.peregud.studentdao.util.HibernateUtil.createEntityManager();
        List<?> applicants = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            applicants = entityManager.createQuery("FROM Applicant").getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return applicants;
    }
}
