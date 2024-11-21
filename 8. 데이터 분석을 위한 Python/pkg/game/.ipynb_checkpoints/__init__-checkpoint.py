# import game 만 해도 game으로 render_test를 접근 가능
from .graphic.render import render_test

VERSION = 1.0  # game 패키지에서 공유할 변수 

def show_game_version():  # game 패키지에서 공유할 함수
    print(f'게임버전: {VERSION}')

# 초기화 작업 : import 시 최소 한번만 실행!
print("---- 게임 로딩 초기화..... -----")