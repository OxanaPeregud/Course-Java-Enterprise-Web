package com.peregud.studentdao.servlet;

import com.peregud.studentdao.dao.StudentDAO;
import com.peregud.studentdao.dao.impl.StudentDAOImpl;
import com.peregud.studentdao.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddStudentServlet extends HttpServlet {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view/student-form.jsp").forward(request, response);
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
        studentDAO.add(student);
        response.sendRedirect(request.getContextPath() + "/list");
    }
}
