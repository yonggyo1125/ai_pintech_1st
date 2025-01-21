/* Union 타입 - |, & */
//let fruits: string[] = ['사과', '오렌지', '바나나'];
//let fruits: (string | number)[] = ["사과", "오렌지", 1000]

/* 객체 타입 */
//let person: { name: string; age: number }
//person = { name: '이이름', age: 40 }
//person = { name: '이이름' }

/* 옵셔널 체이닝 ? - 타입은 한정하지만 필수는 아닌 속성 */
let person: { name: string; age?: number }
person = { name: '이이름' }
