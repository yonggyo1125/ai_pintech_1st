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
  const [form, setForm] = useState<FormType>({})
  const [errors, setErrors] = useState({})

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
     * 2) 비밀번호 자리수
     * 3) 비밀번호 확인과 일치 여부
     * 4) 서버 처리 요청
     * 5) 가입 완료 후 후속 처리
     */

    const _errors = {}
    let hasErrors = false
    // 1) 필수 항목 검증 S
    const requiredFields = {
      email: '이메일을 입력하세요.',
      password: '비밀번호를 입력하세요.',
      confirmPassword: '비밀번호를 확인하세요.',
      name: '이름을 입력하세요.',
    }

    for (const [field, msg] of Object.entries(requiredFields)) {
      if (!form[field] || !form[field].trim()) {
        // 필수 항목 누락이 된 경우
        _errors[field] = _errors[field] ?? []
        _errors[field].push(msg)
        hasErrors = true
      }
    }

    // 1) 필수 항목 검증 E
    setErrors(_errors)

    if (!hasErrors) {
      // 검증 성공 : 서버쪽에 처리 요청
    }
  }

  return (
    <>
      <JoinForm
        onSubmit={onSubmit}
        onChange={handleChange}
        onToggle={handleToggle}
        errors={errors}
        form={form}
      />
    </>
  )
}

export default JoinContainer
