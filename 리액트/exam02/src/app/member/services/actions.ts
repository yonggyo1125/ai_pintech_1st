'use server'

export const processJoin = async (formState, formData: FormData) => {
  /**
   * 1) 필수 항목 검증
   * 2) 비밀번호와 비밀번호 확인 일치 여부
   * 3) 서버쪽에 처리 요청
   * 4) 후속 처리 -> 로그인 페이지 이동
   */
  const errors = {}

  // 1) 필수 항목 검증 S
  const requiredFields = {
    email: '이메일을 입력하세요.',
    password: '비밀번호를 입력하세요.',
    confirmPassword: '비밀번호를 확인하세요.',
    name: '회원명을 입력하세요.',
  }
  for (const [field, msg] of Object.entries(requiredFields)) {
    const value = formData.get(field)
    if (!value || !value?.trim()) {
      errors[field] = errors[field] ?? []
      errors[field].push(msg)
    }
  }
  // 1) 필수 항목 검증 E

  // 2) 비밀번호와 비밀번호 확인 일치 여부
  const password = formData.get('password')
  const confirmPassword = formData.get('confirmPassword')
  if (
    password &&
    password?.trim() &&
    confirmPassword &&
    confirmPassword?.trim() &&
    password !== confirmPassword
  ) {
    errors.confirmPassword = errors.confirmPassword ?? []
    errors.confirmPassword.push('비밀번호가 일치하지 않습니다.')
  }

  // 3) 서버쪽에 처리 요청
  const form = { ...formData.entries() }

  try {
    const res = await fetch('https://member-service.koreait.xyz/join', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(form),
    })

    const json = await res.json()
    console.log('json', json)
  } catch (err) {
    console.error(err)
  }

  return errors
}
