package com.peregud.multipletables.servlet;

import com.peregud.multipletables.util.DataGeneratorUtil;
import com.peregud.multipletables.util.DataUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-tasks")
public class AddTasksServlet extends HttpServlet {
    private static final int NUMBER_OF_TASKS = 5;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        DataUtil.saveData(DataGeneratorUtil.buildTask(NUMBER_OF_TASKS));
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath() + "/get-tasks-table");
    }
}
