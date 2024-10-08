package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int rank = 4;
        switch(rank) {
            case 1:
                System.out.println("금메달");
                break;
            case 2:
                System.out.println("은메달");
                break; // 실행 흐름 종료
            case 3:
                System.out.println("동메달");
                break;
            default: // 모든 값에 매칭이 되지 않는 경우 실행 시점
                System.out.println("입상");
        }
    }
}
