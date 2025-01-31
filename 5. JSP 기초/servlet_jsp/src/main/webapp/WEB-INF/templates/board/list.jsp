<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<table border='1'>
    <thead>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>내용</th>
            <th>작성자</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${items}">
        <tr>
            <td>${item.seq}</td>
            <td>${item.subject}</td>
            <td>${item.content}</td>
            <td>${item.poster}</td>
        </tr>
    <%--
        <tr>
            <td>${item.getSeq()}</td>
            <td>${item.getSubject()}</td>
            <td>${item.getContent()}</td>
            <td>${item.getPoster()}</td>
        </tr>
    --%>
    </c:forEach>
    </tbody>
</table>
${pageContext.getRequest().getRequestURI()}<br>
${pageContext.request.requestURI}