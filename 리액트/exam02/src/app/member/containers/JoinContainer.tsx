'use client'
import JoinForm from '../components/JoinForm'
import { processJoin } from '../services/actions'
import { useActionState, useState } from 'react'

type FormType = {
  email?: string
  password?: string
  confirmPassword?: string
  name?: string
  agree?: boolean
}

const JoinContainer = () => {
  const [form, setForm] = useState<FormType>({})
  const actionState = useActionState(processJoin, {})

  const handleChange = (e) => {
    setForm((form) => ({ ...form, [e.target.name]: e.target.value }))
  }

  return (
    <JoinForm actionState={actionState} onChange={handleChange} form={form} />
  )
}

export default JoinContainer
