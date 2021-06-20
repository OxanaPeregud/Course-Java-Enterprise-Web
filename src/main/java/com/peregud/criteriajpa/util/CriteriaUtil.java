package com.peregud.criteriajpa.util;

import com.peregud.criteriajpa.model.Student;
import lombok.experimental.UtilityClass;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@UtilityClass
public class CriteriaUtil {

    public String[] greaterThanCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.gt(root.get("fee"), 250));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] lessThanCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.lt(root.get("fee"), 250));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] likeCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.like(root.get("name"), "%michael%"));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] likeCaseCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%michael%"));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] betweenCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.between(root.get("fee"), 200, 400));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] inCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(root.get("course").in("Java", "JavaScript"));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] nullCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.isNull(root.get("course")));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] notNullCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.isNotNull(root.get("course")));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] twoCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        Predicate[] predicates = new Predicate[2];
        predicates[0] = criteriaBuilder.isNotNull(root.get("course"));
        predicates[1] = criteriaBuilder.like(root.get("name"), "james%");
        criteriaQuery.select(root)
                .where(predicates);
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] andLogicalCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        Predicate predicate1 = criteriaBuilder.gt(root.get("fee"), 250);
        Predicate predicate2 = criteriaBuilder.like(root.get("name"), "James%");
        criteriaQuery.select(root)
                .where(criteriaBuilder.and(predicate1, predicate2));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] orLogicalCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        Predicate predicate1 = criteriaBuilder.gt(root.get("fee"), 250);
        Predicate predicate2 = criteriaBuilder.like(root.get("name"), "James%");
        criteriaQuery.select(root)
                .where(criteriaBuilder.or(predicate1, predicate2));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public String[] sortingCriteria() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root);
        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("name")), criteriaBuilder.desc(root.get("fee")));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> resultList = query.getResultList();
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i).getName();
        }
        entityManager.close();
        return result;
    }

    public Long[] projectionRowCount() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(criteriaBuilder.count(root));
        TypedQuery<Long> query = entityManager.createQuery(criteriaQuery);
        List<Long> resultList = query.getResultList();
        Long[] result = new Long[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        entityManager.close();
        return result;
    }

    public Double[] projectionAverage() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Double> criteriaQuery = criteriaBuilder.createQuery(Double.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(criteriaBuilder.avg(root.get("fee")));
        TypedQuery<Double> query = entityManager.createQuery(criteriaQuery);
        List<Double> resultList = query.getResultList();
        Double[] result = new Double[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        entityManager.close();
        return result;
    }

    public Integer[] projectionSum() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Integer> criteriaQuery = criteriaBuilder.createQuery(Integer.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(criteriaBuilder.sum(root.get("fee")));
        TypedQuery<Integer> query = entityManager.createQuery(criteriaQuery);
        List<Integer> resultList = query.getResultList();
        Integer[] result = new Integer[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        entityManager.close();
        return result;
    }

    public boolean checkIfCriteriaTimeLower() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        long startTimeCriteria = System.nanoTime();
        criteriaQuery.select(root)
                .where(criteriaBuilder.like(root.get("name"), "%Michael%"));
        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        List<Student> results = query.getResultList();
        long endTimeCriteria = System.nanoTime();
        long executionCriteria = (endTimeCriteria - startTimeCriteria);
        long startTimeHQL = System.nanoTime();
        entityManager.getTransaction().begin();
        List<?> students = entityManager.createQuery("FROM Student where name like '%Michael%'")
                .getResultList();
        long endTimeHQL = System.nanoTime();
        long executionHQL = (endTimeHQL - startTimeHQL);
        return executionCriteria <= executionHQL;
    }
}
