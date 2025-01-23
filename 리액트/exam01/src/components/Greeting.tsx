const Greeting = () => {
  const name = '이이름'
  const date = new Date()
  return (
    <>
      <h1>{name}님 반값습니다.</h1>
      <h2>현재 시간: {date.toLocaleString()}</h2>
    </>
  )
}

export default Greeting
