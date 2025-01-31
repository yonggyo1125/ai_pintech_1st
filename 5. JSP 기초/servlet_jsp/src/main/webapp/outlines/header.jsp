<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String key1 = request.getParameter("key1");
    String key2 = request.getParameter("key2");
    System.out.printf("key1=%s, key2=%s%n", key1, key2);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP 연습!</title>
    </head>
    <body>
        <header>
            <h1>사이트 상단 영역!</h1>
        </header>