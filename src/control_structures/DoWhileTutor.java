package control_structures;
/*
    The main difference between WHILE and DO-WHILE is that the instructions from DO-WHILE
    are executed at least once.

    do{
        instruction_1
        instruction_2
        .............
    }while(condition);
 */
public class DoWhileTutor {
    public static void main(String[] args){
        int x = 20;
        do{
            System.out.println("x = " + x);
            x = x - 1;
        }while(x > 10);
    }
}

