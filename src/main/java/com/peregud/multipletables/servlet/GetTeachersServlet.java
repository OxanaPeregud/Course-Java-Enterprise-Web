package com.peregud.multipletables.servlet;

import com.peregud.multipletables.util.DataUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get-teachers-table")
public class GetTeachersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("teachers", DataUtil.getAll("Teacher"));
        request.getRequestDispatcher("/teachers-table.jsp").forward(request,response);
    }
}
