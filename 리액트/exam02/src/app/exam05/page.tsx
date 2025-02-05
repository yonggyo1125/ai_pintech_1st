'use client'
import { useState, useCallback } from 'react'
import classNames from 'classnames'

const Exam05Page = () => {
  const [clicked, setClicked] = useState<boolean>(false)

  const handleToggle = useCallback(() => setClicked((clicked) => !clicked), [])

  return (
    <button
      type="button"
      onClick={handleToggle}
      className={classNames('btn', { on: clicked })}
    >
      클릭
    </button>
  )
}

export default Exam05Page
