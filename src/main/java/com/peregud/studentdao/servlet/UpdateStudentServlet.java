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

@WebServlet("/student/update")
public class UpdateStudentServlet extends HttpServlet {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("studentId");
        Student student = studentDAO.getById(Integer.parseInt(id));
        request.setAttribute("student", student);
        request.getRequestDispatcher("/WEB-INF/view/student-form.jsp").forward(request, response);
    }
}
