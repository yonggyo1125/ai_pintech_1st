<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String test1 = (String)pageContext.getAttribute("test1");
    String test2 = (String)pageContext.getAttribute("test2");
%>

<h1>ex12.jsp</h1>
test1=<%=test1%>, test2=<%=test2%>
