'use client'
import JoinForm from '../components/JoinForm'
import { processJoin } from '../services/actions'
import { useActionState } from 'react'

const JoinContainer = () => {
  const actionState = useActionState(processJoin, {
    email: '',
  })
  return <JoinForm actionState={actionState} />
}

export default JoinContainer
