'use client'
import { createContext } from 'react'
import Component1 from './Component1'

export const ColorContext = createContext({
  color: '',
})

const Exam08Page = () => {
  return (
    <ColorContext.Provider value={{ color: 'red' }}>
      <Component1 />
    </ColorContext.Provider>
  )
}

export default Exam08Page
