'use client'
import { useState } from 'react'

function getTotal(numbers: number[]) {
  return numbers.reduce((a, b) => a + b)
}

const Exam03Page = () => {
  const [numbers, setNumbers] = useState<number[]>([])
  const [number, setNumber] = useState<number | undefined>()

  const handleChange = (e) => setNumber(e.target.value)
  const handleClick = () => {
    if (number && !isNaN(number)) {
      setNumbers(numbers.concat(number))
    }
  }

  return (
    <>
      <input type="number" onChange={handleChange} />
      <button type="button" onClick={handleClick}>
        더하기
      </button>
      <ul>
        {numbers.map((num, i) => (
          <li key={num + '_' + i}>{num}</li>
        ))}
      </ul>
      <div>합계: {getTotal(numbers)}</div>
    </>
  )
}

export default Exam03Page
