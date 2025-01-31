'use client'
import { FaRegSquareCheck, FaSquareCheck } from 'react-icons/fa6'

const JoinForm = ({ onSubmit, onChange, onToggle, form }): React.ReactNode => {
  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>이메일</dt>
        <dd>
          <input
            type="text"
            name="email"
            value={form.email}
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
            value={form.password}
            onChange={onChange}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPassword"
            value={form.confirmPassword}
            onChange={onChange}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="name"
            value={form.name}
            onChange={onChange}
          />
        </dd>
      </dl>
      <div onClick={onToggle}>
        {form.agree ? <FaSquareCheck /> : <FaRegSquareCheck />} 회원가입 약관에
        동의합니다.
      </div>
      <button type="submit">가입하기</button>
    </form>
  )
}

export default JoinForm
