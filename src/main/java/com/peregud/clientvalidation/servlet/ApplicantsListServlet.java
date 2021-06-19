package com.peregud.clientvalidation.servlet;

import com.peregud.clientvalidation.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/applicants-list")
public class ApplicantsListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("applicants", DBUtil.getAll());
        request.getRequestDispatcher("/applicants-list.jsp").forward(request, response);
    }
}
