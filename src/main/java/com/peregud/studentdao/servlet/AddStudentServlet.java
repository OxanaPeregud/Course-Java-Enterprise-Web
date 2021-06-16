package com.peregud.studentdao.servlet;

import com.peregud.studentdao.model.Student;
import com.peregud.studentdao.service.StudentService;
import com.peregud.studentdao.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/add")
public class AddStudentServlet extends HttpServlet {
    private final StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/student-form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Student student = new Student();

        if (request.getParameter("studentId") != null && !request.getParameter("studentId").isEmpty()) {
            student.setId(Integer.parseInt(request.getParameter("studentId")));
        }

        student.setFirstName(request.getParameter("firstName"));
        student.setLastName(request.getParameter("lastName"));
        student.setEmail(request.getParameter("email"));
        studentService.addStudent(student);
        response.sendRedirect("../student/list");
    }
}
