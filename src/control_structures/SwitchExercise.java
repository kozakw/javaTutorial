package control_structures;

public class SwitchExercise {
    /*
    Using a switch statement, evaluate a String containing one of the following values:
        sp, su, au, wi - based on this value - it will display one of the messages below,
        for the corresponding season
        Summer (su) - Way too hot
        Winter (wi) - Way too cold
        Autumn/Spring (au, sp) - Just right
     */
    public static void main(String[] args) {
//        String season = "au";
        String season = "summer";
        switch (season.substring(0, 2)) { //substring - extracting part of the string between two different indexes
            case "sp":
            case "au":
                System.out.println("Just right!");
                break;
            case "su":
                System.out.println("Way too hot!");
                break;
            case "wi":
                System.out.println("Way too cold!");
                break;
            default:
                System.out.println("this is not a season!");
        }

        //Alternative starting with Java 14
//        String message = switch(season.substring(0, 2)){
//            case "au", "sp" -> "Just right";
//            case "su" -> "Way too hot";
//            case "wi" -> "way too cold";
//            default -> "Incorrect string";
//        };
//        System.out.println(message);
    }
}
