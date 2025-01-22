import Link from 'next/link'
export default function BoardListPage() {
  return (
    <div>
      <h1>서버사이드 렌더링(SSR)</h1>
      <a href="/board/view/123">게시글 123</a>

      <h1>클라이언트 사이드 렌더링(CSR)</h1>
      <Link href="/board/view/123">게시글 123</Link>
    </div>
  )
}
