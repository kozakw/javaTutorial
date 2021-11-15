package control_structures;

public class SwitchTutor {
    /*
    evalueted_expression can be int/char/String/enum
         switch(evaluated_expression){
             case <first_res_of_expression>:
                 //instructions for the first case
             break;

              case <second_res_of_expression>:
                 //instructions for the second case
              break;
              default:
                 //instructions executed if none of the above cases matches the result of my expression
                 //adding a default is optional
         }
      */
    public static void main(String[] args){
        int currentDay = 6;
        switch(currentDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
//            case 6, 7: //syntax only for Java 17
//                System.out.println("Week-end");
//                break;
            case 6:
            case 7: //syntax for any Java version
                System.out.println("Week-end");
                break;
            default:
                System.out.println("Not a day of the week!");
        }
    }
}
