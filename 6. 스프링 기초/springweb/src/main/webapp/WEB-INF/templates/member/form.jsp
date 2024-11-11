<%@ page contentType='text/html; charset=UTF-8' %>
<h1>로그인 페이지</h1>
<form method="POST" action="join">
    <dl>
        <dt>이메일</dt>
        <dd>
            <input type="text" name="email">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <input type="password" name="password">
        </dd>
    </dl>
    <button type="submit">로그인</button>
</form>