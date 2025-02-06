'use client'
import React, { useRef, useEffect } from 'react'
import styles from './member.module.scss'

const LoginForm = ({ form, onChange, actionState, className }) => {
  const [errors, formAction, isPending] = actionState
  const emailEl = useRef<HTMLInputElement | undefined>(undefined)

  useEffect(() => {
    //console.log('emailEl', emailEl)
    if (emailEl) {
      emailEl.current?.focus()
    }
  }, [emailEl])

  return (
    <>
      <form action={formAction} className={className}>
        <dl className={styles.row}>
          <dt className={styles.title}>이메일</dt>
          <dd>
            <input
              ref={emailEl}
              type="text"
              name="email"
              value={form?.email ?? ''}
              onChange={onChange}
            />
          </dd>
          {errors?.email && errors?.email.map((m) => <div key={m}>{m}</div>)}
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
          {errors?.password &&
            errors?.password.map((m) => <div key={m}>{m}</div>)}
        </dl>
        <button type="submit" disabled={isPending}>
          로그인
        </button>
        {errors?.global && errors?.global.map((m) => <div key={m}>{m}</div>)}
      </form>
    </>
  )
}

export default React.memo(LoginForm)
