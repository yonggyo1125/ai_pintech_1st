'use client'
import { Component } from 'react'

class Counter2 extends Component {
  state: { number: number } = {
    number: 0,
  }

  render() {
    const { number } = this.state

    return (
      <>
        <h1>{number}</h1>
        <button type="button">-1</button>
        <button type="button">+1</button>
      </>
    )
  }
}

export default Counter2
