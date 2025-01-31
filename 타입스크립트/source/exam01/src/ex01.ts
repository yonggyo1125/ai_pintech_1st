// 변수 - 원시타입
let num: number
num = 100
//num = 'ABC'

let _name: string | number = '이름'
//_name = true
_name = 100
//_name = true

// 변수 - 배열 객체 타입
let fruits: string[] = ['사과', '오렌지', '멜론']
//fruits = '사과'

//let data: [string, number] = ['이름', 40]  // 첫번째는 문자형, 두번째는 숫자형
let data: (string | number)[] = [40, '이름', '테스트'] // 순서 상관없이 문자형 또는 숫자형이 오는 타입
//data = ['이름', '사십']

// 변수 - 객체 타입
let person: { name: string; age: number } = { name: '이이름', age: 40 }
//person = { name: '이이름' }
