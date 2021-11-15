package control_structures;
/*
    while(condition){
        instruction_1
        instruction_2
        .............
    }
 */
public class WhileTutor {
    public static void main(String[] args){
//        int x = 10;
//        while(x > 0){
//            System.out.println("x = " + x);
//            x = x - 1;
//        }
//        System.out.println("Hello world!");
        int x = 10;
        while(true){
            System.out.println("x = " + x);
            x = x - 1;
            if(x == 5){
                System.out.println("End of the program");
                break;
            }
        }

        int a = 10; //12
        int b = ++a; //11 - assignment to b that takes place AFTER the increment of a
        int c = a++; //11 - assignment to c takes place BEFORE the increment of a
        System.out.println("a = " + a + " b = " + b + " c = " + c);

        int i = 10; //12
        int j = 15; //14
        int value = i++ + ++j + ++i - j-- - --j;
        //10 + 16  + 12  - 16  - 14 = 8
        System.out.println("value = " + value + " i = " + i + " j = " + j);
    }
}