'use client'
import { useState } from 'react'
import JoinForm from '../components/JoinForm'

type FormType = {
  email?: string
  password?: string
  confirmPassword?: string
  name?: string
  agree?: boolean
}

const JoinContainer = (): React.ReactNode => {
  const [form, setForm] = useState<FormType>({ email: 'user01@test.org' })

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value })
  }

  const handleToggle = () => {
    setForm({ ...form, agree: !Boolean(form.agree) })
  }

  /**
   * 양식 제출시 처리 함수
   */
  const onSubmit = (e) => {
    // form 태그의 기본 동작 차단
    e.preventDefault()

    /**
     * 양식 검증
     * 1) 필수 항목 검증
     * 2)
     */
  }

  return (
    <>
      <JoinForm
        onSubmit={onSubmit}
        onChange={handleChange}
        onToggle={handleToggle}
        form={form}
      />
    </>
  )
}

export default JoinContainer
