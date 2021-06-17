package com.peregud.studentdao.servlet;

import com.peregud.studentdao.dao.StudentDAO;
import com.peregud.studentdao.dao.impl.StudentDAOImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/delete")
public class DeleteStudentServlet extends HttpServlet {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("studentId");
        studentDAO.delete(Integer.parseInt(id));
        response.sendRedirect("../student/list");
    }
}
