export default async function BoardViewPage({ params, searchParams }) {
  console.log('params', params) // 경로변수
  console.log('searchParams', searchParams) // 쿼리스트링

  const { seq } = params
  console.log('seq', seq)
  const { t1, t2 } = searchParams
  console.log('query', t1, t2)
  return <h1>게시글 보기 페이지...</h1>
}
