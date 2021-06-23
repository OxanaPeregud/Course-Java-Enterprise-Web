package com.peregud.calculation.servlet;

import com.peregud.calculation.util.CylinderUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate-cylinder-area")
public class CalculateCylinderAreaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String radius = request.getParameter("radius");
        String height = request.getParameter("height");
        try {
            double area = CylinderUtil.calculateArea(Double.parseDouble(radius), Double.parseDouble(height));
            request.setAttribute("area", area);
            request.getRequestDispatcher("/view/calculate-cylinder-area.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/view/calculate-cylinder-area.jsp");
        }
    }
}
