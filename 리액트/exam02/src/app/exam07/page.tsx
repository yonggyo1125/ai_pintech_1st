'use client'
import { useState } from 'react'
import loadable from '@loadable/component'

const Message = loadable(() => import('../exam06/Message'), {
  fallback: <div>로딩중...</div>,
})

const Exam07Page = () => {
  const [visible, setVisible] = useState<boolean>(false)

  return (
    <>
      <button type="button" onClick={() => setVisible(true)}>
        클릭
      </button>
      {visible && <Message />}
    </>
  )
}

export default Exam07Page
