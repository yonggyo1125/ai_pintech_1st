'use client'
import { Component } from 'react'

class Counter2 extends Component<unknown, { number: number }> {
  state: { number: number } = {
    number: 0,
  }

  render() {
    const { number } = this.state

    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          //onClick={() => this.setState({ number: number - 1 })}
          onClick={() =>
            this.setState(({ number }) => ({ number: number - 1 }))
          }
        >
          -1
        </button>
        <button
          type="button"
          //onClick={() => this.setState({ number: number + 1 })}
          onClick={() =>
            this.setState(({ number }) => ({ number: number + 1 }))
          }
        >
          +1
        </button>
      </>
    )
  }
}

export default Counter2
