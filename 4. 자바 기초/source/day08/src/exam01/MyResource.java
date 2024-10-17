package exam01;

public class MyResource extends java.lang.Object implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("MyResource 자원 해제!");
    }
}
