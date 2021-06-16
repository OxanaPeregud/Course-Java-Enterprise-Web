package com.peregud.studentdao.dao;

import com.peregud.studentdao.model.Student;
import com.peregud.studentdao.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<Student> getStudents() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        List<Student> students = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            TypedQuery<Student> query = entityManager.createQuery("FROM Student ORDER BY lastName", Student.class);
            students = query.getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(student);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void deleteStudent(int id) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.createQuery("DELETE FROM Student WHERE id = :studentId")
                    .setParameter("studentId", id)
                    .executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Student getStudentById(int id) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        Student student = new Student();
        try {
            entityManager.getTransaction().begin();
            student = entityManager.find(Student.class, id);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return student;
    }
}
