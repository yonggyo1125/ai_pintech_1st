/*
type Fruit = {
  name: string
}

type House = {
  rooms: number
}

class Box<T extends Fruit> {
  private _item: T

  set item(item: T) {
    this._item = item
  }

  get item(): T {
    return this._item
  }
}

const box1 = new Box<Fruit>()
//const box2 = new Box<House>()
//box1.item = { name: '사과' }
//box1.item = { rooms: 10 }
//box2.item = { rooms: 10 }
*/
