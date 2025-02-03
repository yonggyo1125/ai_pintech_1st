const LoginForm = ({ form, onChange }) => {
  return (
    <>
      <form>
        <dl>
          <dt>이메일</dt>
          <dd>
            <input
              type="text"
              name="email"
              value={form?.email ?? ''}
              onChange={onChange}
            />
          </dd>
        </dl>
        <dl>
          <dt>비밀번호</dt>
          <dd>
            <input
              type="password"
              name="password"
              value={form?.password ?? ''}
              onChange={onChange}
            />
          </dd>
        </dl>
        <button type="submit">로그인</button>
      </form>
    </>
  )
}

export default LoginForm
