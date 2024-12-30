package exam;

public class Ex01 {
    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("작업2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("작업3");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        });

        th.start();
        th2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("메인 작업");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

