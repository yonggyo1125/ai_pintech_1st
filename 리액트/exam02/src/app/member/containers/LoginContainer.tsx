'use client'
import React, { useState, useActionState } from 'react'
import styled from 'styled-components'
import { processLogin } from '../services/actions'
import LoginForm from '../components/LoginForm'

const StyledLoginForm = styled(LoginForm)`
  border: 10px solid orange;
`

const LoginContainer = () => {
  const [form, setForm] = useState<{ email?: string; password?: string }>({})
  const actionState = useActionState(processLogin, form)

  const handleChange = (e) =>
    setForm((form) => ({ ...form, [e.target.name]: e.target.value }))

  return (
    <StyledLoginForm
      actionState={actionState}
      form={form}
      onChange={handleChange}
    />
  )
}

export default React.memo(LoginContainer)
