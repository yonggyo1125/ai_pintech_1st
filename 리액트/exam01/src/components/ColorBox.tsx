'use client'
import { useState, useLayoutEffect } from 'react'

const ColorBox = (): React.ReactNode => {
  const [colors, setColors] = useState<string[]>([])
  const [selected, setSelected] = useState<string>('gray')
}

/*
const ColorBox = (): React.ReactNode => {
  //const handleClick = () => alert('테스트')
  //return <button onClick={handleClick}>클릭</button>\
  //return <button onClick={() => alert('테스트')}>클릭</button>
}
*/
export default ColorBox
