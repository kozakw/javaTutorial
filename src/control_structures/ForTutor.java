package control_structures;

public class ForTutor {
    public static void main(String[] args) {
        //        for(int x = 0; x < 10; x = x+1){
//            System.out.println("x = " + x);
//        }

//        for(int x = 0, y = 15; x < 10 && y > 10; x = x + 1, y = y - 1){
//            System.out.println("x * y = " + (x * y));
//        }
        int i = 0;
        for(;;){
            if(i < 10) {
                if(i == 5){
                    i = i + 1;
                    continue; //the purpose of continue is to jump directly to the next iteration of the for
                    //without continuing the current iteration
                }
                System.out.println(i);
                i = i + 1;
            }else{
                break; //the purpose of break is to break the loop and continue my program
            }
        }
        System.out.println("HELLO WORLD!");
    }
}

