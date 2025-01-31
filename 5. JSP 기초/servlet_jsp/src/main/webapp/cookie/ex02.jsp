<%@ page contentType='text/html; charset=UTF-8' %>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        System.out.printf("name=%s, value=%s%n", cookie.getName(), cookie.getValue());
    }
%>