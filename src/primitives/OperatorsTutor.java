package primitives;

public class OperatorsTutor {
    public static void main(String[] args){
        int a = 10, b = 20, c;
        c = 30;

        int d = a + b - c;
        d = a * 2 + b - 10;
        d = c / 5;
        d = a + (b + c) * 5;
        System.out.println(d); //230
        d = a % 3; // 1 - rest of the 10/3 operation
        System.out.println(d);

        double x = 10.5 % 3.4;
        System.out.println(x);

        boolean b1 = 3 > 4; //false
        boolean b2 = 5 == 5; //true
        boolean b3 = 5 != 6; //true
        boolean b4 = b2 == false; //false

        char c1 = 'a';
        char c2 = 'A';
        System.out.println(c1 > c2); //the comparison is done between the numerical values that are used
        //to represent the characters in the unicode table

        boolean b6 = b4 || b3; //false OR true -> true
        boolean b7 = b1 && b2; //false AND true -> false
    }
}