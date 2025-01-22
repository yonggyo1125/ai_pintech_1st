export default async function BoardViewPage({ params, searchParams }) {
  console.log('params', params) // 경로변수
  console.log('searchParams', searchParams) // 쿼리스트링

  const { seq } = await params()
  console.log('seq', seq)
  const query = await searchParams()
  console.log('query', query)
  return <h1>게시글 보기 페이지...</h1>
}
