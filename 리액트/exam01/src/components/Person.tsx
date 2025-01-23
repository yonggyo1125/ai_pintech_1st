import { useState } from 'react'

type PersonType = {
  name: string
  age: number
}

const Person = () => {
  const state = useState<PersonType>({
    name: '이이름',
    age: 40,
  })
  console.log('state', state)
  return <></>
}

export default Person
