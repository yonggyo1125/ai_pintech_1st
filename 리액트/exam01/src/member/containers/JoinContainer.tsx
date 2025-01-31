'use client'
import { useState } from 'react'
import JoinForm from '../components/JoinForm'

type FormType = {
  email: string
  password: string
  confirmPassword: string
  name: string
}

const JoinContainer = (): React.ReactNode => {
  const [form, setForm] = useState<FormType>()

  const handleChange = (e) => {}

  /**
   * 양식 제출시 처리 함수
   */
  const onSubmit = (e) => {
    // form 태그의 기본 동작 차단
    e.preventDefault()
  }

  return <JoinForm onSubmit={onSubmit} onChange={handleChange} />
}

export default JoinContainer
