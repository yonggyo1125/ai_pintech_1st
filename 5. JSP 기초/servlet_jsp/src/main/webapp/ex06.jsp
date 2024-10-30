<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forEach var="i" begin="1" end="10">
<h1>반복 ${i}</h1>
</c:forEach>

<%
    // 주석입니다!
%>

<%-- JSP 주석입니다! JSP가 서블릿 클래스로 번역될떄 번역 배제... --%>