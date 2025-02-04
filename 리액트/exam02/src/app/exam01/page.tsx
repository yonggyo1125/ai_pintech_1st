'use client'
import { useState } from 'react'

const Counter = () => {
  const [number, setNumber] = useState<number>(0)

  return (
    <>
      <h1>{number}</h1>
      <button onClick={() => setNumber(number - 1)}>-1</button>
      <button onClick={() => setNumber(number + 1)}>+1</button>
    </>
  )
}

export default Counter
