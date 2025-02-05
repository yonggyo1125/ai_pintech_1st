'use client'
import { FaRegSquareCheck, FaSquareCheck } from 'react-icons/fa6'
import { Button } from '@/app/global/components/StyledButton'

const JoinForm = ({ actionState, onChange, onToggle, form }) => {
  const [errors, formAction, isPending] = actionState
  return (
    <>
      <form action={formAction}>
        <dl>
          <dt>이메일</dt>
          <dd>
            <input
              type="text"
              name="email"
              onChange={onChange}
              value={form?.email ?? ''}
            />
            {errors?.email && errors.email.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <dl>
          <dt>비밀번호</dt>
          <dd>
            <input
              type="password"
              name="password"
              onChange={onChange}
              value={form?.password ?? ''}
            />
            {errors?.password &&
              errors.password.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <dl>
          <dt>비밀번호 확인</dt>
          <dd>
            <input
              type="password"
              name="confirmPassword"
              onChange={onChange}
              value={form?.confirmPassword || ''}
            />
            {errors?.confirmPassword &&
              errors.confirmPassword.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <dl>
          <dt>회원명</dt>
          <dd>
            <input
              type="text"
              name="name"
              onChange={onChange}
              value={form?.name || ''}
            />
            {errors?.name && errors.name.map((m) => <div key={m}>{m}</div>)}
          </dd>
        </dl>
        <div onClick={onToggle}>
          {form?.agree ? <FaSquareCheck /> : <FaRegSquareCheck />} 회원가입
          약관에 동의합니다.
        </div>
        <Button type="submit" disabled={isPending} color="blue">
          가입하기
        </Button>
      </form>
    </>
  )
}

export default JoinForm
