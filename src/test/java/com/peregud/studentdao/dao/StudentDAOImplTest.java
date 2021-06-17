package com.peregud.studentdao.dao;

import com.peregud.studentdao.dao.impl.StudentDAOImpl;
import com.peregud.studentdao.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class StudentDAOImplTest {
    Student student1 = new Student();
    Student student2 = new Student();
    List<Student> studentList = List.of(student1, student2);

    @Test
    void getStudents() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        when(studentDAO.getAll()).thenReturn(studentList);
        assertEquals(studentList, studentDAO.getAll());
    }

    @Test
    void addStudent() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        when(studentDAO.add(student2)).thenReturn(student2);
        assertEquals(student2, studentDAO.add(student2));
    }

    @Test
    void getStudentById() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        when(studentDAO.getById(any(Integer.class))).thenReturn(student1);
        assertEquals(student1, studentDAO.getById(1));
    }
}
