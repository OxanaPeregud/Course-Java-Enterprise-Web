package com.peregud.calculation.servlet;

import com.peregud.calculation.util.CubeUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate-cube-volume")
public class CalculateCubeAreaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String side = request.getParameter("side");
        try {
            double volume = CubeUtil.calculateVolume(Double.parseDouble(side));
            request.setAttribute("volume", volume);
            request.getRequestDispatcher("/calculate-cube-volume.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/calculate-cube-volume.jsp");
        }
    }
}
