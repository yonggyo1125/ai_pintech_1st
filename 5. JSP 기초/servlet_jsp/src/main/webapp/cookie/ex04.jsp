<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key4", "value4");
    cookie.setMaxAge(0); // 1970.1.1 00:00:00
    response.addCookie(cookie);
%>