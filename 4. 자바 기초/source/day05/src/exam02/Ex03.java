package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2();
        //s1.printThis();
        //System.out.println(s1);
        System.out.println(s1 == s1.getThis());
        System.out.println("s1:" + System.identityHashCode(s1));
        Schedule2 _this = s1.getThis();
        System.out.println("this:" + System.identityHashCode(_this));
    }
}
