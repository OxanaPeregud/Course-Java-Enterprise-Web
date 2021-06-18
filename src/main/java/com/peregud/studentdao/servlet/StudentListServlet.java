package com.peregud.studentdao.servlet;

import com.peregud.studentdao.dao.StudentDAO;
import com.peregud.studentdao.dao.impl.StudentDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/list")
public class StudentListServlet extends HttpServlet {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", studentDAO.getAll());
        request.getRequestDispatcher("/list-students.jsp").forward(request,response);
    }
}
