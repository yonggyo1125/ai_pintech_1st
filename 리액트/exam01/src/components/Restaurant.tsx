'use client'
import { useLayoutEffect, useState } from 'react'

type RestaurantType = {
  seq: number
  category: string
  address: string
  name: string
  latitude: number
  longitude: number
}

const Restaurant = () => {
  const [limit, setLimit] = useState<number>(10)
  const [items, setItems] = useState<RestaurantType | undefined>()

  useLayoutEffect(() => {
    const url = `http://restaurant-service.koreait.xyz/restaurant/search?lat=37.5106297&lon=126.7246897&limit=${limit}`
    ;(async () => {
      const res = await fetch(url)
      const items = await res.json()
      setItems(items)
    })()
  }, [items, limit])
  console.log('items', items)
  return (
    <ul>
      {items &&
        items.map((item) => <RestaurantItem key={item.seq} item={item} />)}
    </ul>
  )
}

const RestaurantItem = ({ item }): React.ReactNode => {
  const { category, name } = item
  return (
    <li>
      <span>{category}</span>
      <span>{name}</span>
    </li>
  )
}

export default Restaurant
