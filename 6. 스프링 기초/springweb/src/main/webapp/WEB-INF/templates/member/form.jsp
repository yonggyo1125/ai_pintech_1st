<%@ page contentType='text/html; charset=UTF-8' %>
<h1>로그인 페이지</h1>

${message}

<form method="POST" action="login">
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
    <div>
        <input type='checkbox' name='saveEmail' value="true" id="saveEmail">
        <label for="saveEmail">이메일 기억하기</label>
    </div>
    <button type="submit">로그인</button>
</form>