package com.peregud.studentdao.dao;

import com.peregud.studentdao.dao.impl.StudentDAOImpl;
import com.peregud.studentdao.model.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentDAOImplTest {
    Student student1 = new Student();
    Student student2 = new Student();
    List<Student> studentList = List.of(student1, student2);

    @Test
    public void getStudents() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        when(studentDAO.getAll()).thenReturn(studentList);
        assertEquals(studentList, studentDAO.getAll());
    }

    @Test
    public void addStudent() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        when(studentDAO.add(student2)).thenReturn(student2);
        assertEquals(student2, studentDAO.add(student2));
    }

    @Test
    public void getStudentById() {
        StudentDAOImpl studentDAO = mock(StudentDAOImpl.class);
        when(studentDAO.getById(any(Integer.class))).thenReturn(student1);
        assertEquals(student1, studentDAO.getById(1));
    }
}
