package com.peregud.clientvalidation.servlet;

import com.peregud.clientvalidation.model.Applicant;
import com.peregud.clientvalidation.util.DBUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save-applicant")
public class SaveApplicantServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Applicant applicant = new Applicant();

        if (request.getParameter("applicantId") != null && !request.getParameter("applicantId").isEmpty()) {
            applicant.setApplicantId(Long.parseLong(request.getParameter("applicantId")));
        }

        applicant.setName(request.getParameter("name"));
        applicant.setEmail(request.getParameter("email"));
        applicant.setMobile(Long.parseLong(request.getParameter("mobile")));
        applicant.setCourse(request.getParameter("course"));
        applicant.setGender(request.getParameter("gender"));
        DBUtil.save(applicant);
        response.sendRedirect(request.getContextPath() + "/applicants-list");
    }
}
