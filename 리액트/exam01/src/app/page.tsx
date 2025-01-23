'use client'
//import Counter from '@/components/Counter'
import Greeting from '@/components/Greeting'
import Greeting2 from '@/components/Greeting'
//import { sum, subtract } from '@/components/Greeting'
import { sum as add, subtract } from '@/components/Greeting'
//console.log(sum(10, 20), subtract(20, 10))
console.log(add(10, 20), subtract(20, 10))

export default function MainPage() {
  return (
    <>
      <Greeting />
      <Greeting2 />
    </>
  )
}
