<%@ page contentType='text/html; charset=UTF-8' %>
<%
    //session.removeAttribute("key1");
    session.invalidate(); // 세션 비우기, 로그아웃 기능을 구현할때 많이 사용
%>