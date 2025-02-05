'use client'
import styled, { css } from 'styled-components'

export const Button = styled.button`
  height: 80px;
  min-width: 200px;
  border: 0;
  background: ${({ color }) => color ?? 'black'};
  color: #fff;
`
