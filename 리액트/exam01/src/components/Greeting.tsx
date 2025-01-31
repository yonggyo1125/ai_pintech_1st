//import '../styles/greeting.css'
import '../styles/greeting.css'
const Greeting = () => {
  const name = '이이름'
  const date = new Date()
  const visible = true

  /*
  const style = {
    backgroundColor: 'skyblue',
    color: 'blue',
  }
  */
  return (
    <>
      <h1 // 한줄 주석
        className="title"
      >
        {name}님 반갑습니다.
      </h1>
      {/*
      <h1 style={{ backgroundColor: 'skyblue', color: 'blue' }}>
        {name}님 반값습니다.
      </h1> */}
      {/* visible ? <h2>현재 시간: {date.toLocaleString()}</h2> : '' */}
      {visible && <h2>현재 시간: {date.toLocaleString()}</h2>}
    </>
  )
}

export const sum = (a: number, b: number): number => a + b
export const subtract = (a: number, b: number): number => a - b

export default Greeting
