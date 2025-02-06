'use client'
import React, { useState, Suspense } from 'react'
//import Message from './Message'
const Message = React.lazy(() => import('./Message'))

const Exam06Page = () => {
  const [visible, setVisible] = useState<boolean>(false)

  const handleClick = () => setVisible(true)

  return (
    <>
      <button type="button" onClick={handleClick}>
        클릭
      </button>
      <Suspense fallback={<div>로딩중...</div>}>
        {visible && <Message />}
      </Suspense>
    </>
  )
}

export default Exam06Page
