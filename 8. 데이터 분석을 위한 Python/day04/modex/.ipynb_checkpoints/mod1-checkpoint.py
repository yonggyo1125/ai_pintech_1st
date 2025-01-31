PI = 3.141592

def add(a, b):
    return a + b


def sub(a, b):
    return a - b

# print(__name__) # 현재 실행 중인 모듈 명 
if __name__ == '__main__': # python.exe 로 직접 실행한 경우
    print(add(10, 20))
    print(sub(30, 20))


