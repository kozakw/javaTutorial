package control_structures;

public class ElivsTutor {
    public static void main(String[] args) {
        int y = 10;
        int x;

        if(y >5){
            x = 2 * y;
        }else{
            x = 3* y;
        }
        System.out.println("x = " + x);

        // ?: - ELVIS OPERATOR
        // the goal of ELVIS is to reduce number of lines in case of simple IF-ELSE statement
        x = y > 5 ? 2 * y : 3 * y;  //This structure mirrors th IF from above
        // condition ? instruction_for_true : instruction_for_false
        System.out.println("x = " + x);

        System.out.println(y > 10 ? 20 : "Hello Wiktor!");

        x = y > 5 ? (y > 0 ? y * 4 : y * 10) : (y > 100 ? 15 : 25);
        // you can have nested elvis operators with multiple conditions
        System.out.println("x = " + x);

        //int z = y > 10 ? 20 : "Hello";
        //Not allowed because I can not store String in an int variable - conversion not possible
    }
}
