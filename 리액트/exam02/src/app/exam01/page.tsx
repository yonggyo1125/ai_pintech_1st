'use client'
import { useState, useRef } from 'react'

const Counter = () => {
  const [number, setNumber] = useState<number>(0)
  let num = useRef(1)

  const onIncrease = () => {
    setNumber(number + 1)
    num.current++
  }

  console.log('num', num.current)
  return (
    <>
      <h1>{number}</h1>
      <button onClick={() => setNumber(number - 1)}>-1</button>
      <button onClick={onIncrease}>+1</button>
    </>
  )
}

export default Counter
