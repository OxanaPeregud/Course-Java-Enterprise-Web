package com.peregud.multipletables.servlet;

import com.onelogin.saml2.servlet.ServletUtils;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AddTasksServletTest {

    @Test
    public void doPost() throws IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletUtils.sendRedirect(response, request.getContextPath() + "/get-tasks-table");
        verify(response).sendRedirect(request.getContextPath() + "/get-tasks-table");
    }
}
