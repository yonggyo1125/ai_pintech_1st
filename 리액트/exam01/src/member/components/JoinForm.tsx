'use client'
const JoinForm = ({ onSubmit, onChange }): React.ReactNode => {
  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>이메일</dt>
        <dd>
          <input type="text" name="email" onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input type="password" name="password" onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input type="password" name="confirmPassword" onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input type="text" name="name" onChange={onChange} />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  )
}

export default JoinForm
