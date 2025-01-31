const JoinForm = (): React.ReactNode => {
  return (
    <form>
      <dl>
        <dt>이메일</dt>
        <dd>
          <input type="text" />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input type="password" />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input type="password" />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input type="text" />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  )
}

export default JoinForm
