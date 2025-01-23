'use client'
import { useLayoutEffect, useState } from 'react'

const Restaurant = () => {
  const [limit, setLimit] = useState<number>(10)
  const [items, setItems] = useState({})

  useLayoutEffect(() => {
    const url = `http://restaurant-service.koreait.xyz/restaurant/search?lat=37.5106297&lon=126.7246897&limit=${limit}`
    ;(async () => {
      const res = await fetch(url)
      const items = await res.json()
      console.log(items)
    })()
  }, [])

  return <></>
}

export default Restaurant
