package control_structures;

public class ForExercise {
     /*
            1. Display only the even values between 0 and 50.
      */
     public static void main(String[] args) {

/*          for (int x = 0; x <= 50; x = x + 2) {  //this one is too hard coded
               System.out.print(x + " ");
          }

          System.out.println(" ");

          //Other approach
          for (int x = 0; x <= 50; x = x + 1) {
               if (x % 2 == 0) {
                    System.out.print(x + " ");
               }
          }
          */
           /*
            2. Iterate through the following interval: [0, 45]
            While iterating, if the current value is:
                - divisible by 5 (val % 5 == 0) -> print value, BUZZ
                - divisible by 3 (val % 3 == 0) -> print value, FIZZ
                - divisible by both 3 and 5     -> print value, FIZZ BUZZ
         */

          for (int x = 0; x <= 45; x = x + 1) {
               if (x % 3 == 0 && x % 5 == 0) {
                    System.out.println(x + " FIZZ BUZZ");
               } else {
                    if (x % 3 == 0) {
                         System.out.println(x + " FIZZ");
                    } else {
                         if (x % 5 == 0) {
                              System.out.println(x + " BUZZ");
                         }
                    }
               }
          }
     }
}
