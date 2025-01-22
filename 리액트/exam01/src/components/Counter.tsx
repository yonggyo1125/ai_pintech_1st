import { useState, Fragment } from 'react'

const Counter = () => {
  const [number, setNumber] = useState<number>(1)
  console.log('렌더링!')
  return (
    <>
      <br />
      <h1>{number}</h1>
      <button onClick={() => setNumber(number + 1)}>+1</button>
      <button onClick={() => setNumber(number - 1)}>-1</button>
    </>
  )
}

export default Counter
