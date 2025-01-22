import type { Metadata } from 'next'

export const metadata: Metadata = {
  title: 'Next.js 연습',
  description: '설명...',
}

type PropType = {
  children: React.ReactNode
}

export default function MainLayout({ children }: Readonly<PropType>) {
  return (
    <html>
      <head></head>
      <body>
        <h1>메인 레이아웃</h1>
        {children}
      </body>
    </html>
  )
}
