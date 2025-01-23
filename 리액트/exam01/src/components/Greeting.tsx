//import '../styles/greeting'
import '@styles/greeting'
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
      <h1 className="title">{name}님 반갑습니다.</h1>
      {/*
      <h1 style={{ backgroundColor: 'skyblue', color: 'blue' }}>
        {name}님 반값습니다.
      </h1> */}
      {/* visible ? <h2>현재 시간: {date.toLocaleString()}</h2> : '' */}
      {visible && <h2>현재 시간: {date.toLocaleString()}</h2>}
    </>
  )
}

export default Greeting
