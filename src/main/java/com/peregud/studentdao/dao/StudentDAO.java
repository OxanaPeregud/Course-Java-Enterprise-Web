package com.peregud.studentdao.dao;

import com.peregud.studentdao.model.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getStudents();
    void addStudent(Student student);
    void deleteStudent(int id);
    Student getStudentById(int id);
}
