<%@ page contentType='text/html; charset=UTF-8' %>
<%
Cookie cookie = new Cookie("key1", "value1");
response.addCookie(cookie);
%>