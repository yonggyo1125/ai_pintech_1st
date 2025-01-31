type Person = {
  name: string
  readonly age: number // 읽기 전용, 변경 불가, 삭제 불가 / 데이터 프로퍼티 : writable: false, configurable: false
}

const person: Person = {
  name: '이이름',
  age: 40,
}

//person.age = 50
//delete person.age
//console.log(Object.getOwnPropertyDescriptors(person))

// 전체 person 객체를 읽기 전용으로 변경
type PersonReadonly = Readonly<Person>

const person2: PersonReadonly = {
  name: '이이름',
  age: 40,
}

//person2.name = '김이름'
//person2.age = 50
