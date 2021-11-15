package control_structures;

public class IfTutor {
    /*
    if(evaluated_expression){ //evaluated_expression must return a boolean value
        instructions_for_true_case
    }else{
        instructions_for_false_case
    }
     */
    public static void main(String[] args){
//        int value = 500;
//        if(value < 100){
//            System.out.println("Value is lower than 100");
//        }else{
//            System.out.println("Value is greater than 100");
//        }
        /*
        We are declaring a variable called hourOfDay.
        Based on the value of hourOfDay - I want to display a greeting.
        - hourOfDay < 11 - "Good morning";
        - hourOfDay >= 11 and <= 15 - "Good afternoon";
        - hourOfDay > 15 and <= 22 - "Good evening";
         */
        int hourOfDay = 8;
        if(hourOfDay >= 0 && hourOfDay <= 23) {
            if (hourOfDay >= 6 && hourOfDay < 11) {
                System.out.println("Good morning!");
            } else {
                if (hourOfDay >= 11 && hourOfDay <= 15) {
                    System.out.println("Good afternoon!");
                } else {
                    if (hourOfDay > 15 && hourOfDay <= 22) {
                        System.out.println("Good evening!");
                    }else System.out.println("Good night!");
                }
            }
        }else{
            System.out.println("Invalid value for hourOfDay");
        }
    }
}
