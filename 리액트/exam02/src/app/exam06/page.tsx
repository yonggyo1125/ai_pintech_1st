'use client'
import React, { useState } from 'react'
import Message from './Message'

const Exam06Page = () => {
  const [visible, setVisible] = useState<boolean>(false)

  const handleClick = () => setVisible(true)

  return (
    <>
      <button type="button" onClick={handleClick}>
        클릭
      </button>
      {visible && <Message />}
    </>
  )
}

export default Exam06Page
