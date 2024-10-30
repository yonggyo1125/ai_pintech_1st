<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<h1>에러 발생!!</h1>
<%
    out.write("<h1>" + exception.getMessage() + "</h1>");
    exception.printStackTrace();
%>