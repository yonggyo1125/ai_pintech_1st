/*
interface Print {
  print: () => void
}

interface Position {
  lat: number
  lon: number
}

interface Address {
  zipcode?: string
  address: string
}

class Restaurant implements Position, Print {
  lat: number
  lon: number

  constructor(lat: number, lon: number) {
    this.lat = lat
    this.lon = lon
  }

  print() {
    console.log(this.lat, this.lon)
  }
}

const res = new Restaurant(31.123, 127.123)
res.print()

/*
const loc: Position & { address: string } = {
  lat: 31,
  lon: 127,
  address: '주소',
} 
  */
/*
const loc: Position & Address = {
  lat: 31,
  lon: 127,
  address: '주소',
} */
