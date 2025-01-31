'use client'
import { useState, useLayoutEffect } from 'react'

const colors: string[] = ['gray', 'red', 'blue', 'green', 'skyblue', 'orange']

const ColorBox = (): React.ReactNode => {
  const [selected, setSelected] = useState<string>('gray')

  const handleClick = (color) => setSelected(color)

  return (
    <>
      <ColorTabs onClick={handleClick} />
      <div
        style={{
          background: selected,
          width: 300,
          height: 300,
          border: '1px solid #000',
        }}
      ></div>
    </>
  )
}

const ColorTabs = ({ onClick }) => {
  const tabStyle = {
    display: 'flex',
    height: 100,
    width: 500,
  }
  return (
    <div style={tabStyle} onClick={onClick}>
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
