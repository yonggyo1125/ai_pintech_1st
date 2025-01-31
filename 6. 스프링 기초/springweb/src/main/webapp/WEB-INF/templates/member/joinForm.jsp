<%@ page contentType="text/html; charset=UTF-8" %>
${requestJoin}
<form method="post" action="join">
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
    <dl>
        <dt>비밀번호 확인</dt>
        <dd>
            <input type="password" name="confirmPassword">
        </dd>
    </dl>

    <dl>
        <dt>취미</dt>
        <dd>
            <label>
                <input type="checkbox" name="hobby" value="취미1">취미1
            </label>
            <label>
                <input type="checkbox" name="hobby" value="취미2">취미2
            </label>
            <label>
                <input type="checkbox" name="hobby" value="취미3">취미3
            </label>
        </dd>
    </dl>

    <dl>
        <dt>주소</dt>
        <dd>
            <input type="text" name="addr.zipcode" placeholder="우편번호">
            <input type="text" name="addr.address" placeholder="주소">
            <input type="text" name="addr.addressSub" placeholder="나머지 주소">
        </dd>
    </dl>

    <button type="submit">가입하기</button>
</form>