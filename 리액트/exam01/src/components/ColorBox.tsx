'use client'
import { useState, useLayoutEffect } from 'react'

const colors: string[] = ['gray', 'red', 'blue', 'green', 'skyblue', 'orange']

const ColorBox = (): React.ReactNode => {
  const [selected, setSelected] = useState<string>('gray')

  const handleClick = (color) => setSelected(color)

  return (
    <>
      <ColorTabs />
    </>
  )
}

const ColorTabs = () => {
  const tabStyle = {
    display: 'flex',
    height: 100,
    width: 500,
  }
  return (
    <div style={tabStyle}>
      {colors.map((color) => (
        <div
          key={color}
          style={{ background: color, width: 0, flexGrow: 1 }}
        ></div>
      ))}
    </div>
  )
}

/*
const ColorBox = (): React.ReactNode => {
  //const handleClick = () => alert('테스트')
  //return <button onClick={handleClick}>클릭</button>\
  //return <button onClick={() => alert('테스트')}>클릭</button>
}
*/
export default ColorBox
