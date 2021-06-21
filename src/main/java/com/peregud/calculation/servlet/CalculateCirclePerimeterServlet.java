package com.peregud.calculation.servlet;

import com.peregud.calculation.util.CircleUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate-circle-perimeter")
public class CalculateCirclePerimeterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String radius = request.getParameter("radius");
        try {
            double perimeter = CircleUtil.calculatePerimeter(Double.parseDouble(radius));
            request.setAttribute("perimeter", perimeter);
            request.getRequestDispatcher("/calculate-circle-perimeter.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/calculate-circle-perimeter.jsp");
        }
    }
}
