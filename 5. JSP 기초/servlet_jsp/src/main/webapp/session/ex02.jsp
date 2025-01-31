<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String key1 = (String)session.getAttribute("key1");
    String key2 = (String)session.getAttribute("key2");
%>
key1=<%=key1%>, key2=<%=key2%>