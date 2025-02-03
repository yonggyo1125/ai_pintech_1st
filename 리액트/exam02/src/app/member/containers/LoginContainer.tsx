'use client'
import { useState } from 'react'
import LoginForm from '../components/LoginForm'
const LoginContainer = () => {
  const [form, setForm] = useState<{ email?: string; password?: string }>({})

  const handleChange = (e) =>
    setForm((form) => ({ ...form, [e.target.name]: e.target.value }))

  return <LoginForm form={form} onChange={handleChange} />
}

export default LoginContainer
