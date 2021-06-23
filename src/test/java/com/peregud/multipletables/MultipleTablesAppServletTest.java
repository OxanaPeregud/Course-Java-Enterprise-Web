package com.peregud.multipletables;

import com.onelogin.saml2.servlet.ServletUtils;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MultipleTablesAppServletTest {

    @Test
    public void service() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getScheme()).thenReturn("http");
        when(request.getServerName()).thenReturn("localhost");
        when(request.getServerPort()).thenReturn(8080);
        assertEquals("http://localhost:8080", ServletUtils.getSelfURLhost(request));
        String path = "http://localhost:8080/JD2_WEB_war_exploded";
        when(request.getContextPath()).thenReturn(path);
        assertEquals("http://localhost:8080/JD2_WEB_war_exploded", request.getContextPath());
    }
}
