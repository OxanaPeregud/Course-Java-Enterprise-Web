package com.peregud.calculation.servlet;

import com.peregud.calculation.util.CubeUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate-cube-area")
public class CalculateCubeVolumeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String side = request.getParameter("side");
        try {
            double area = CubeUtil.calculateArea(Double.parseDouble(side));
            request.setAttribute("area", area);
            request.getRequestDispatcher("/view/calculate-cube-area.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/view/calculate-cube-area.jsp");
        }
    }
}
