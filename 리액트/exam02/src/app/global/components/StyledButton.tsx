'use client'
import styled, { css } from 'styled-components'

const commonStyle = css`
  height: 80px;
  color: #fff;
`

export const Button = styled.button`
  ${commonStyle}
  min-width: 200px;
  border: 0;
  background: ${({ color }) => color ?? 'black'};
  ${({ border }) =>
    border &&
    css`
      border: 10px solid black;
      color: orange;
    `}
`
export const Button2 = styled.button`
  ${commonStyle}
`
