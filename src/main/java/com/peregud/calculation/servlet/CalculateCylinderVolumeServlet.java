package com.peregud.calculation.servlet;

import com.peregud.calculation.util.CylinderUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate-cylinder-volume")
public class CalculateCylinderVolumeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String radius = request.getParameter("radius");
        String height = request.getParameter("height");
        try {
            double volume = CylinderUtil.calculateVolume(Double.parseDouble(radius), Double.parseDouble(height));
            request.setAttribute("volume", volume);
            request.getRequestDispatcher("/calculate-cylinder-volume.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/calculate-cylinder-volume.jsp");
        }
    }
}
