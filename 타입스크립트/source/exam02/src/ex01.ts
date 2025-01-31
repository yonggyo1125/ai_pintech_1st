/* Union 타입 - |, & */
//let fruits: string[] = ['사과', '오렌지', '바나나'];
//let fruits: (string | number)[] = ["사과", "오렌지", 1000]

/* 객체 타입 */
//let person: { name: string; age: number }
//person = { name: '이이름', age: 40 }
//person = { name: '이이름' }

/* 옵셔널 체이닝 ? - 타입은 한정하지만 필수는 아닌 속성 */
//let person: { name: string; age?: number }
//person = { name: '이이름' }

/* any 타입 */
//let a; // any 타입
//let a: any // 모든 타입 가능
//a = 100
//a = 'ABC'

/* unknown 타입 */
/*
let a: unknown
a = 'ABC'
//a.toUpperCase() // 에러 발생, 타입 체크가 반드시 필요(unknown)
if (typeof a === 'string') {
  a.toUpperCase()
} */

/* 함수 타입 */
/*
function printName(name: string, formatter: (name: string) => string): void {
  console.log(formatter(name))
}

printName('이이름', (name) => `${name}님`)
*/
