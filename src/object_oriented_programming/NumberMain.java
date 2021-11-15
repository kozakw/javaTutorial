package object_oriented_programming;

public class NumberMain {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number(3,4);
        Number n3 = new Number(5);
        Number n4 = new Number(6.0);
        Number n5 = new Number("6");
//        System.out.println(n1.x + " " + n1.y);
//        System.out.println(n2.x + " " + n2.y);
//        System.out.println(n3.x + " " + n3.y);
//        System.out.println(n4.x + " " + n4.y);
//        System.out.println(n5.x + " " + n5.y);

        System.out.println(n1.operation(1, 1));
        System.out.println(n1.operation(5, 6.0));
        System.out.println(n1.operation(6.3, 2));
        System.out.println(n1.operation(10));
    }
}
