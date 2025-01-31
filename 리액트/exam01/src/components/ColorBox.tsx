'use client'
import { useState, useLayoutEffect } from 'react'

const colors: string[] = ['gray', 'red', 'blue', 'green', 'skyblue', 'orange']

const ColorBox = (): React.ReactNode => {
  const [selected, setSelected] = useState<string>('gray')

  const handleClick = (color) => setSelected(color)

  console.log('렌더링!', selected)

  return (
    <>
      <ColorTabs onClick={handleClick} />
      <input type="text" placeholder="색상을 입력하세요" />
      <div
        style={{
          background: selected,
          width: 300,
          height: 300,
          border: '10px solid #000',
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
    <div style={tabStyle}>
      {colors.map((color) => (
        <div
          onClick={() => onClick(color)}
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
