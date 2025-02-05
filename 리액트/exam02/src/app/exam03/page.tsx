'use client'
import { useState } from 'react'

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

  )
}

export default Exam03Page
