import { useState } from 'react'

const Counter = () => {
  const [number, setNumber] = useState<number>(1)

  return (
    <div>
      <h1>{number}</h1>
      <button onClick={() => setNumber(number + 1)}>+1</button>
      <button onClick={() => setNumber(number - 1)}>-1</button>
    </div>
  )
}

export default Counter
