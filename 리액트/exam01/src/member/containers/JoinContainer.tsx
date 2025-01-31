'use client'
import JoinForm from '../components/JoinForm'

const JoinContainer = (): React.ReactNode => {
  /**
   * 양식 제출시 처리 함수
   */
  const onSubmit = (e) => {
    // form 태그의 기본 동작 차단
    e.preventDefault()
  }

  return <JoinForm onSubmit={onSubmit} />
}

export default JoinContainer
