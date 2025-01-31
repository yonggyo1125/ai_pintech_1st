'use client'
import { useState } from 'react'

const colors: string[] = ['gray', 'red', 'blue', 'green', 'skyblue', 'orange']

const ColorBox = (): React.ReactNode => {
  const [selected, setSelected] = useState<string>('gray')
  const [border, setBorder] = useState<string>('black')

  const handleClick = (color) => setSelected(color)

  const handleChange = (e) => {
    console.log('타이핑!', this)
    console.log('입력한 값: ', e.target.value)
    console.log('이벤트 발생 요소:', e.target)
    setBorder(e.target.value)
  }
  //console.log('렌더링!', selected)

  return (
    <>
      <ColorTabs onClick={handleClick} />
      <input
        type="text"
        placeholder="색상을 입력하세요"
        onChange={handleChange}
      />
      <div
        style={{
          background: selected,
          width: 300,
          height: 300,
          borderWidth: 10,
          borderStyle: 'solid',
          borderColor: border,
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
