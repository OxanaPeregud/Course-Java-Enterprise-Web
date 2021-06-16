package com.peregud.studentdao.service;

import com.peregud.studentdao.dao.StudentDAOImpl;
import com.peregud.studentdao.dao.StudentDAO;
import com.peregud.studentdao.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }

    @Override
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }
}
