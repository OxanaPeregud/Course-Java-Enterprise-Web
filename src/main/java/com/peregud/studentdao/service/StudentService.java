package com.peregud.studentdao.service;

import com.peregud.studentdao.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    void addStudent(Student student);
    void deleteStudent(int id);
    Student getStudentById(int id);
}
