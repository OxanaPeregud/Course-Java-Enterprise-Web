package com.peregud.calculation.servlet;

import com.peregud.calculation.util.RectangleUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate-rectangle-area")
public class CalculateRectangleAreaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstSide = request.getParameter("firstSide");
        String secondSide = request.getParameter("secondSide");
        try {
            double area = RectangleUtil.calculateArea(Double.parseDouble(firstSide), Double.parseDouble(secondSide));
            request.setAttribute("area", area);
            request.getRequestDispatcher("/calculate-rectangle-area.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/calculate-rectangle-area.jsp");
        }
    }
}
