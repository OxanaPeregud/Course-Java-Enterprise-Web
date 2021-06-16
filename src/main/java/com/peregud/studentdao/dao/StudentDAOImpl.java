package com.peregud.studentdao.dao;

import com.peregud.studentdao.model.Student;
import com.peregud.studentdao.util.HibernateUtil;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<Student> getStudents() {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Student> query = entityManager.createQuery("FROM Student ORDER BY lastName", Student.class);
        List<Student> students = query.getResultList();
        entityManager.getTransaction().commit();
        return students;
    }

    @Override
    public void addStudent(Student student) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(student);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteStudent(int id) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        entityManager.getTransaction().begin();
        Query<?> query = (Query<?>) entityManager.createQuery("DELETE FROM Student WHERE id = :studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public Student getStudentById(int id) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, id);
        entityManager.getTransaction().commit();
        return student;
    }
}
