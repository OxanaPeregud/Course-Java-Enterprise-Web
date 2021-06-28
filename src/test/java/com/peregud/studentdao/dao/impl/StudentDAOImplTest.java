package com.peregud.studentdao.dao.impl;

import com.peregud.studentdao.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StudentDAOImplTest {

    @Test
    void getAll() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        List<Student> list = new ArrayList<>();
        when(studentDAO.getAll()).thenReturn(list);
        assertEquals(list, studentDAO.getAll());
    }

    @Test
    void add() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        Student student = new Student();
        when(studentDAO.add(student)).thenReturn(student);
        assertEquals(student, studentDAO.add(student));
    }

    @Test
    void getById() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        Student student = new Student();
        when(studentDAO.getById(any(Integer.class))).thenReturn(student);
        assertEquals(student, studentDAO.getById(1));
    }
}
