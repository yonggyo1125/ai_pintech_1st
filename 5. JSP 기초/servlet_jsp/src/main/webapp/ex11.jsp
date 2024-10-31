<%@ page contentType="text/html; charset=UTF-8" %>
<%
    //pageContext.setAttribute("test1", "테스트1");
    //pageContext.setAttribute("test2", "테스트2");
    request.setAttribute("test1", "테스트1");
    request.setAttribute("test2", "테스트2");
%>

<jsp:include page="ex12.jsp" />

<h1>ex11.jsp</h1>
<%
    //String test1 = (String)pageContext.getAttribute("test1");
    //String test2 = (String)pageContext.getAttribute("test2");

    String test1 = (String)request.getAttribute("test1");
    String test2 = (String)request.getAttribute("test2");
%>
test1=<%=test1%>, test2=<%=test2%>