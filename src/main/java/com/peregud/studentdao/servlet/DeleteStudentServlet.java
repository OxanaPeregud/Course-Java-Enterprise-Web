package com.peregud.studentdao.servlet;

import com.peregud.studentdao.service.StudentService;
import com.peregud.studentdao.service.StudentServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/delete")
public class DeleteStudentServlet extends HttpServlet {
    private final StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("studentId");
        studentService.deleteStudent(Integer.parseInt(id));
        response.sendRedirect("/student/list");
    }
}
