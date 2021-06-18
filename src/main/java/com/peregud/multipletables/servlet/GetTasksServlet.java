package com.peregud.multipletables.servlet;

import com.peregud.multipletables.util.DataUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get-tasks-table")
public class GetTasksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("tasks", DataUtil.getAll("Task"));
        request.getRequestDispatcher("/tasks-table.jsp").forward(request,response);
    }
}
