package com.peregud.calculation.servlet;

import com.peregud.calculation.util.RectangleUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate-rectangle-perimeter")
public class CalculateRectanglePerimeterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstSide = request.getParameter("firstSide");
        String secondSide = request.getParameter("secondSide");
        try {
            double perimeter = RectangleUtil.calculatePerimeter(Double.parseDouble(firstSide), Double.parseDouble(secondSide));
            request.setAttribute("perimeter", perimeter);
            request.getRequestDispatcher("/calculate-rectangle-perimeter.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/calculate-rectangle-perimeter.jsp");
        }
    }
}
